package com.create.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipFactory
 * @Description TODO
 * @date 2019/12/20  15:00
 **/
public class VipFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new VipProduct();
    }
}
