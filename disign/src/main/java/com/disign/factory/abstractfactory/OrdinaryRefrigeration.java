package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryRefrigeration
 * @Description TODO
 * @date 2019/8/21  17:05
 **/
public class OrdinaryRefrigeration implements Refrigeration {
    @Override
    public void refrigeration() {
        System.out.println("普通冷藏");
    }
}
