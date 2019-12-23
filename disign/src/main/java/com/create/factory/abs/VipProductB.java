package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipProductB
 * @Description TODO
 * @date 2019/12/20  15:09
 **/
public class VipProductB implements Product {
    @Override
    public void operator() {
        System.out.println("VipProductB");
    }
}
