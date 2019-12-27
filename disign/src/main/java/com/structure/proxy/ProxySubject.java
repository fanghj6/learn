package com.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProxySubject
 * @Description TODO
 * @date 2019/12/23  16:01
 **/
public class ProxySubject implements Subject  {

    private Ticket ticket = new Ticket();

    private void preRequest(){
        System.out.println("代理购票");
    }
    private void postRequest(){
        System.out.println("代理购票成功");
    }

    @Override
    public void request() {
        preRequest();
        ticket.buyTickets();
        postRequest();
    }
}
