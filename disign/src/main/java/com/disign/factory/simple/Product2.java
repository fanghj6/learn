package com.disign.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product1
 * @Description TODO
 * @date 2019/8/20  14:21
 **/
public class Product2 extends Product{
    @Override
    public void buyProduct() {
        System.out.println("您购买了 Product2 产品");
    }

    @Override
    public String toString() {
        return  "Product2 产品";
    }
}
