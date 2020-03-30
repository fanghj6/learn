package com.version2.create.factory.AbsFactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/17  17:51
 **/
public class Client {

    public static void main(String[] args) {
        //抽象工厂模式
        //角色:抽象工厂，具体工厂，抽象产品，具体产品

        ProductFactory productFactory = new HEProductFactory();
        productFactory.createRefrigerator().display();
        productFactory.createTelevision().display();
    }
}
