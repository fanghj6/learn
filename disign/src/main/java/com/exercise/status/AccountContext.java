package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AccountContext
 * @Description TODO
 * @date 2019/12/5  14:12
 **/
public class AccountContext extends Context {

    public AccountContext(Account account,Status status) {
        System.out.println("当前登录用户  ："+account.getName());
        this.setAccount(account);
        this.setStatus(status);
    }

    @Override
    public void save(Double amt) {
        System.out.println("发起存款 amt = "+amt);
        System.out.println("存款前余额 amt ："+this.getAccount().getAmt());
        System.out.println("存款前状态 "+this.getStatus().getClass().getSimpleName());
        this.getStatus().save(this,amt);
        System.out.println("存款后余额 amt ："+this.getAccount().getAmt());
        System.out.println("存款后状态 "+this.getStatus().getClass().getSimpleName());
        System.out.println("=====================================");
    }

    @Override
    public void take(Double amt) {
        System.out.println("发起取款 amt = "+amt);
        System.out.println("取款前余额 amt ："+this.getAccount().getAmt());
        System.out.println("取款前状态 "+this.getStatus().getClass().getSimpleName());
        this.getStatus().take(this,amt);
        System.out.println("取款后余额 amt ："+this.getAccount().getAmt());
        System.out.println("取款后状态 "+this.getStatus().getClass().getSimpleName());
        System.out.println("=====================================");
    }
}
