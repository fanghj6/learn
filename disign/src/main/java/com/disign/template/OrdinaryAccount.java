package com.disign.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryAccount
 * @Description TODO
 * @date 2019/11/20  10:36
 **/
public class OrdinaryAccount extends Account {
    @Override
    protected void calculatingInterest() {
        System.out.println("普通方式计算利息");
    }
}
