package com.disign.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  模板模式
 * @date 2019/11/20  10:38
 **/
public class Client {

    public static void main(String[] args) {
        Account account = new OrdinaryAccount();

        account.templateMethod("admin","password123");
        account.templateMethod("vip","vip");

        Account vipAccount = new VipAccount();
        vipAccount.templateMethod("vip","vip");
        vipAccount.templateMethod("admin","password123");
    }
}
