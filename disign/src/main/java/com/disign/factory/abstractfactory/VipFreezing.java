package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipFreezing
 * @Description TODO
 * @date 2019/8/21  17:02
 **/
public class VipFreezing implements Freezing {
    @Override
    public void freezing() {
        System.out.println("VIP冷冻");
    }
}
