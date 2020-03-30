package com.version2.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProxySubject
 * @Description TODO
 * @date 2020/3/20  17:52
 **/
public class ProxySubject implements Subject {

    private Subject subject  = new RealSubject();;


    @Override
    public String request(String username, String password) {
        pre(username, password);
        String result = null;
        if(account( username,  password)) {
             result = this.subject.request(username, password);
        }
        post(result);
        return result;

    }

    private boolean account(String username, String password) {
        if ("admin".equals(username) && "admin".equals(password)) {
            return true;
        }
        return false;
    }

    private void pre(String username, String password) {
        System.out.println("记录日志：username=" + username + " password=" + password);
    }

    private void post(String data) {
        System.out.println("记录日志：response=" + data);
    }


}
