package com.version2.behavior.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Buyticket
 * @Description TODO
 * @date 2020/3/24  21:38
 **/
public class Buyticket {

    private Algorithm algorithm;

    private double price;

    public Buyticket(double price) {
        this.price = price;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void ticket(){
        System.out.println("消费 "+algorithm.calculation(price)+"元");
    }
}
