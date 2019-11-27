package com.disign.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  策略模式
 * @date 2019/11/19  17:39
 **/
public class Client {

    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        ticketManager.setPrice(100);
        ticketManager.setDiscount(new OrdinaryDiscount());
        System.out.println("=========== 普通  ==========");
        ticketManager.algorithm();

        ticketManager.setDiscount(new StudentDiscount());
        System.out.println("=========== 学生  ==========");
        ticketManager.algorithm();

        ticketManager.setDiscount(new VipDiscount());
        System.out.println("=========== vip  ==========");
        ticketManager.algorithm();
    }
}
