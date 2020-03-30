package com.version2.create.factory.method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Book
 * @Description TODO
 * @date 2020/3/16  19:59
 **/
public class Book implements Product {
    @Override
    public void show() {
        System.out.println("create Book ");
    }
}
