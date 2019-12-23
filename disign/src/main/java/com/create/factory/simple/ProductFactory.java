package com.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2019/12/20  14:47
 **/
public class ProductFactory {

    public static String ORDINARY = "ordinary";
    public static String VIP = "vip";

    public static Product getProduct(String type){

        if (ProductFactory.ORDINARY.equals(type)) {
            return new OrdinaryProduct();
        } else if (ProductFactory.VIP.equals(type)) {
            return new VipProduct();
        }
        return null;
    }
}
