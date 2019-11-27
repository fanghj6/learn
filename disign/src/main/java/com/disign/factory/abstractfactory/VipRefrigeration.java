package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipRefrigeration
 * @Description TODO
 * @date 2019/8/21  17:05
 **/
public class VipRefrigeration implements Refrigeration {
    @Override
    public void refrigeration() {
        System.out.println("VIP冷藏");
    }
}
