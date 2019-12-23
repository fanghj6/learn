package com.create.factory.abs;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipProductA
 * @Description TODO
 * @date 2019/12/20  15:09
 **/
public class VipProductA implements Product {
    @Override
    public void operator() {
        System.out.println("VipProductA");
    }
}
