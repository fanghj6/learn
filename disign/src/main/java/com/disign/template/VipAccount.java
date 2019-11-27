package com.disign.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipAccount
 * @Description TODO
 * @date 2019/11/20  10:36
 **/
public class VipAccount  extends Account{

    @Override
    protected boolean validate(String name, String password) {
        if(name.equals("vip") && password.equals("vip")){
            return true;
        }
        return false;
    }

    @Override
    protected void calculatingInterest() {
        System.out.println("Vip方式计算利息");
    }
}
