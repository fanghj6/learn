package com.version2.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2020/3/16  20:18
 **/
public abstract class ProductFactory {

    //创建产品
     protected abstract Product createProduct();

    //显示产品
    public void show(){
        Product product = createProduct();
        product.show();
    }
}
