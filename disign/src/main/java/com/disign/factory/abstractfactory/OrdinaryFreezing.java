package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryFreezing
 * @Description TODO
 * @date 2019/8/21  17:02
 **/
public class OrdinaryFreezing implements Freezing {
    @Override
    public void freezing() {
        System.out.println("普通冷冻");
    }
}
