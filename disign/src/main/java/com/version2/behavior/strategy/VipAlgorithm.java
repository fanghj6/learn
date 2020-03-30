package com.version2.behavior.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipAlgorithm
 * @Description TODO
 * @date 2020/3/24  21:45
 **/
public class VipAlgorithm implements Algorithm {
    @Override
    public double calculation(double money) {
        System.out.println("vip 打5折");
        return money * 0.5;
    }
}
