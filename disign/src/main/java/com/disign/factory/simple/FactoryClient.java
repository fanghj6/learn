package com.disign.factory.simple;



/**
 * @author fhj
 * @version 1.0
 * @ClassName FactoryClient
 * @Description TODO
 * @date 2019/8/20  14:30
 **/
public class FactoryClient {

    public static void main(String[] args) {
       Product product = Factory.createProduct("Product1");
       product.show();
       product.buyProduct();
    }
}
