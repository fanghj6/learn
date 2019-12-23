package com.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  简单工厂   角色：工厂类，抽象产品，具体产品
 * @date 2019/12/20  14:53
 **/
public class Client {

    public static void main(String[] args) {
       Product product = ProductFactory.getProduct(ProductFactory.ORDINARY);
       product.operator();
    }
}
