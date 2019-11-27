package com.disign.status.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AccountState
 * @Description TODO 抽象状态类
 * @date 2019/11/19  10:03
 **/
public abstract class AccountState {

    protected Account acc;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}
