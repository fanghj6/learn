package com.disign.builder;

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
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);

        Builder builder1 = new BuilderB();
        Director director1 = new Director(builder1);
        Product product1 = director1.construct();
        System.out.println(product1);
    }
}
