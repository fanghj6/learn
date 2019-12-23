package com.create.factory.factory;


/**
 * @author fhj
 * @version 1.0
 * @ClassName VipProduct
 * @Description TODO
 * @date 2019/12/20  14:46
 **/
public class VipProduct extends Product {
    @Override
    public void operator() {
        System.out.println("VipProduct");
    }
}
