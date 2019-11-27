package com.disign.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipDiscount
 * @Description TODO vip打折算法
 * @date 2019/11/19  17:27
 **/
public class VipDiscount extends  Discount{


    @Override
    public double discount(double price) {
        return price * 0.8;
    }
}
