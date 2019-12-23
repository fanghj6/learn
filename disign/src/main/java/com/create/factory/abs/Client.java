package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  抽象工厂模式，角色：抽象工厂，具体工厂，抽象产品，具体产品
 * @date 2019/12/20  15:19
 **/
public class Client {

    public static void main(String[] args) {
        ProductFactory factory = new ProductAFactory();
        factory.getOrdinaryProduct().operator();

        factory = new ProductBFactory();
        factory.getOrdinaryProduct().operator();
    }
}
