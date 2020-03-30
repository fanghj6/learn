package com.version2.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName CupFactory
 * @Description TODO
 * @date 2020/3/16  20:23
 **/
public class CupFactory extends ProductFactory {
    @Override
    protected Product createProduct() {
        return new Cup();
    }
}
