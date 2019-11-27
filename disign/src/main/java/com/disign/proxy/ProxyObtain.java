package com.disign.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProxyObtain
 * @Description TODO
 * @date 2019/9/17  21:23
 **/
public class ProxyObtain implements Obtain {

    private Info info = new Info();

    private Verification verification;

    private InfoLog infoLog;


    @Override
    public String getInfo(String userId, String token) {

        validata(userId,token);
        String str =info.getInfo(userId,token);
        log(userId,token);

        return str;
    }


    private boolean validata(String userId, String token){
        verification = new Verification();
       return  verification.verifyUser(userId,token);
    }

    private void log(String userId, String token){
        infoLog = new InfoLog();
        infoLog.recordingLog(userId,token);
    }
}
