package com.structure.proxy.jdkproxy;


/**
 * @author fhj
 * @version 1.0
 * @ClassName Ticket
 * @Description TODO
 * @date 2019/12/23  16:03
 **/
public class Ticket implements AbsTicket {

    @Override
    public void buyTickets(){
        System.out.println("购票中。。。");
    }
}
