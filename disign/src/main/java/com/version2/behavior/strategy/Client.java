package com.version2.behavior.strategy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/24  21:36
 **/
public class Client {

    public static void main(String[] args) {
        //策略模式
        //角色：环境类，抽象策略类，具体策略类
        Algorithm algorithm = new StudentAlgorithm();
        Buyticket buyticket = new Buyticket(100);
        buyticket.setAlgorithm(algorithm);
        buyticket.ticket();

        System.out.println("================");
        algorithm = new VipAlgorithm();
        buyticket.setAlgorithm(algorithm);
        buyticket.ticket();
    }
}
