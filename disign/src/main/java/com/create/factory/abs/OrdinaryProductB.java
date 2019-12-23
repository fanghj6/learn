package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryProductB
 * @Description TODO
 * @date 2019/12/20  15:09
 **/
public class OrdinaryProductB implements Product {
    @Override
    public void operator() {
        System.out.println("OrdinaryProductB");
    }
}
