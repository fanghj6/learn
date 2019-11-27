package com.disign.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Account
 * @Description TODO  账户管理
 * @date 2019/11/20  10:28
 **/
public abstract class Account {


    /**
     * 模板方法
     */
    public void templateMethod(String name,String password){
        if(validate( name, password)){
            calculatingInterest();
            display();
            return;
        }
        System.out.println("用户名或密码错误");
    }


    /**
     * 验证用户是否登录
     */
    protected boolean validate(String name,String password){
        if(name.equals("admin") && password.equals("password123")){
            return true;
        }
        return false;
    }

    /**
     * 计算利息
     */
    protected abstract void calculatingInterest();


    /**
     * 显示利息
     */
    protected void display(){
        System.out.println("显示利息");
    }
}
