package com.disign.status.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  状态模式测试类
 * @date 2019/11/19  10:11
 **/
public class Client {

    public static void main(String[] args) {
        Account acc = new Account("段誉", 0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);

        acc.withdraw(6000);
        acc.withdraw(1000);
        acc.computeInterest();

        System.out.println(acc);
    }

}
