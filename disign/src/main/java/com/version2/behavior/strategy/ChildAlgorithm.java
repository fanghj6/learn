package com.version2.behavior.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ChildAlgorithm
 * @Description TODO
 * @date 2020/3/24  21:43
 **/
public class ChildAlgorithm implements Algorithm {
    @Override
    public double calculation(double money) {
        System.out.println("购买儿童票 减10元");
        return money - 10;
    }
}
