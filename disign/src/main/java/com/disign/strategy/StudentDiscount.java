package com.disign.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName StudentDiscount
 * @Description TODO 学生打折算法
 * @date 2019/11/19  17:28
 **/
public class StudentDiscount extends Discount  {

    @Override
    public double discount(double price) {
        return price - 10;
    }
}
