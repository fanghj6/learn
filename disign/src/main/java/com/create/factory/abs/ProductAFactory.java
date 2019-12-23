package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductAFactory
 * @Description TODO
 * @date 2019/12/20  15:13
 **/
public class ProductAFactory implements ProductFactory {

    @Override
    public Product getVipProduct() {
        return new VipProductA();
    }

    @Override
    public Product getOrdinaryProduct() {
        return new OrdinaryProductA();
    }
}
