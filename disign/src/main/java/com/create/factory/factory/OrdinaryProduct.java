package com.create.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryProduct
 * @Description TODO
 * @date 2019/12/20  14:45
 **/
public class OrdinaryProduct extends Product {
    @Override
    public void operator() {
        System.out.println("OrdinaryProduct");
    }
}
