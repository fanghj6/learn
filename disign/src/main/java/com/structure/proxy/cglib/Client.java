package com.structure.proxy.cglib;


/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/23  16:24
 **/
public class Client {

    public static void main(String[] args) {
        CglibProxy jdkProxy = new CglibProxy();
        Ticket ticket = jdkProxy.getProxy(Ticket.class);
        ticket.buyTickets();
    }
}
