package com.create.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryFactory
 * @Description TODO
 * @date 2019/12/20  14:59
 **/
public class OrdinaryFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new OrdinaryProduct();
    }
}
