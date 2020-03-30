package com.version2.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RealSubject
 * @Description TODO
 * @date 2020/3/20  17:52
 **/
public class RealSubject implements Subject {
    @Override
    public String request(String username,String password) {
        return username+" get data";
    }
}
