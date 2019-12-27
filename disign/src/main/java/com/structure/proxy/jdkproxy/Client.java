package com.structure.proxy.jdkproxy;


/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/23  16:24
 **/
public class Client {

    public static void main(String[] args) {
        AbsTicket absTicket = new Ticket();
        JdkProxy jdkProxy = new JdkProxy(absTicket);
        AbsTicket ticket = jdkProxy.getProxy();
        ticket.buyTickets();
    }
}
