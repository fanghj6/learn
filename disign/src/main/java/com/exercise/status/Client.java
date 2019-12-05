package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  状态模式
 * @date 2019/12/5  14:36
 **/
public class Client {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAmt(0.0);
        account.setId(1);
        account.setName("李四");
        Status status = new NormalStatus();
        Context context = new AccountContext(account,status);
        //正常 200
        context.save(200.0);
        //透支 1800
        context.take(2000.0);
        //受限 3800
        context.take(2000.0);
        //受限无法取款 3800
        context.take(2000.0);
        //透支 1800
        context.save(2000.0);
        //正常 200
        context.save(2000.0);
    }
}
