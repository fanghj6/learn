package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/24  19:32
 **/
public class Client {

    public static void main(String[] args) {
        //状态模式
        //角色:环境类，抽象状态类，具体状态类

        Account account = new Account();
        account.setName("test");
        account.setDeposit(0);

        Context context = new Context(account);

        context.save(200);
        System.out.println("======================");
        context.take(800);
        System.out.println("======================");
        context.take(1800);
        System.out.println("======================");
        context.take(800);
        System.out.println("======================");
        context.save(2000);
    }
}
