package com.version2.behavior.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName StudentAlgorithm
 * @Description TODO
 * @date 2020/3/24  21:41
 **/
public class StudentAlgorithm implements Algorithm{
    @Override
    public double calculation(double money) {
        System.out.println("购买学生票 8折");
        return money * 0.8;
    }
}
