package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryProductA
 * @Description TODO
 * @date 2019/12/20  15:09
 **/
public class OrdinaryProductA implements Product {
    @Override
    public void operator() {
        System.out.println("OrdinaryProductA");
    }
}
