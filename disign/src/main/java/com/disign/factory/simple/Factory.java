package com.disign.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName 产品工厂类
 * @Description TODO
 * @date 2019/8/20  14:24
 **/
public class Factory {

    public final static  String productPackage = "com.disign.disign.factory.simple.";

    public static Product createProduct(String productName){
        Product product = null;
        try {
            Class productClass = Class.forName(productPackage+productName);
            product = (Product) productClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
