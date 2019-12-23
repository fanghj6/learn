package com.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  建造者模式，角色：指挥者，抽象建造者，具体建造者，产品
 * @date 2019/12/20  16:21
 **/
public class Client {

    public static void main(String[] args) {
        Builder builder = new BuildOrdinaryProduct();

        Director director = new Director(builder);
        Product product = director.buildProduct();
        System.out.println(product);

        director.setBuilder(new BuildVipProduct());
        product = director.buildProduct();
        System.out.println(product);
    }
}
