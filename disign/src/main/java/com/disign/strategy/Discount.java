package com.disign.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Discount
 * @Description TODO  打折算法
 * @date 2019/11/19  17:22
 **/
public abstract class Discount {

    /**
     * 打折算法
     * @return
     */
   public double discount(double price){
       System.out.println("原价："+price);
       return price;
   }
}
