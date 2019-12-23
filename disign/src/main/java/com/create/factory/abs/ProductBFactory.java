package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductBFactory
 * @Description TODO
 * @date 2019/12/20  15:13
 **/
public class ProductBFactory implements ProductFactory {

    @Override
    public Product getVipProduct() {
        return new VipProductB();
    }

    @Override
    public Product getOrdinaryProduct() {
        return new OrdinaryProductB();
    }
}
