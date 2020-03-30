package com.version2.create.factory.method;

import com.version2.util.PropertiesConfigUtil;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/16  20:24
 **/
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        //工厂方法模式
        //角色：抽象工厂，具体工厂，抽象产品，具体产品

        ProductFactory productFactory = (ProductFactory) PropertiesConfigUtil.getObject("method.type");

        productFactory.show();
    }
}
