package com.disign.builder.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/28  9:25
 **/
public class Client {

    public static void main(String[] args) {
        Builder builder = new BuilderA();
        Product product = builder.getResult();
        System.out.println(product);

        Builder builder1 = new BuilderB();
        Product product1 = builder1.getResult();
        System.out.println(product1);
    }
}
