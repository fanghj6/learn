package com.disign.proxy;

import java.util.UUID;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  保护代理
 * @date 2019/9/17  21:39
 **/
public class Client {

    /**
     *  代理模式分为，保护，远程，虚拟，缓冲  代理
     * @param args
     */
    public static void main(String[] args) {

        Obtain obtain = new ProxyObtain();
        obtain.getInfo("007", UUID.randomUUID().toString());
    }
}
