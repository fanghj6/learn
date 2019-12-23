package com.create.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  工厂方法模式，角色：抽象工厂，具体工厂，抽象产品，具体产品
 * @date 2019/12/20  15:01
 **/
public class Client {

    public static void main(String[] args) {
        ProductFactory factory= new VipFactory();
        factory.getProduct().operator();
    }
}
