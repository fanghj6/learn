package com.create.single;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  单例模式  ，角色：单例
 * @date 2019/12/20  15:29
 **/
public class Client {

    public static void main(String[] args) {

        //懒汉
        Product product =  Product.newInstance();
        product.setName("test");
        product.operator();

        Product product1 =  Product.newInstance();
        System.out.println(product == product1);

        //饿汉
        ProductB productb =  ProductB.newInstance();
        productb.setName("test");
        productb.operator();

        ProductB productb1 =  ProductB.newInstance();
        System.out.println(productb == productb1);
    }
}
