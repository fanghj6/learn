package com.version2.create.factory.method;



/**
 * @author fhj
 * @version 1.0
 * @ClassName BookFactory
 * @Description TODO
 * @date 2020/3/16  20:22
 **/
public class BookFactory extends ProductFactory {

    @Override
    protected Product createProduct() {
        return new Book();
    }
}
