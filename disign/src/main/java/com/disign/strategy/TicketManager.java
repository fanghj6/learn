package com.disign.strategy;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TicketManager
 * @Description TODO
 * @date 2019/11/19  17:30
 **/
@Data
public class TicketManager {

    private Discount discount;

    private double price;

    public void algorithm(){
       double result = discount.discount(price);
        System.out.println("需付款  :"+result);
    }
}
