package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName State
 * @Description TODO
 * @date 2020/3/24  19:33
 **/
public abstract class  State {

    private Account account;

    public State(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void take(double money) {
        System.out.println("取款 "+money);
        account.setDeposit(account.getDeposit()-money);
        System.out.println("money : "+account.getDeposit());
    }


    public void save(double money) {
        System.out.println("存款 "+money);
        account.setDeposit(account.getDeposit()+money);
        System.out.println("money : "+account.getDeposit());
    }


    public void interest() {
        System.out.println("计算利息 money : "+account.getDeposit());
    }

    public  abstract void checkState(Context context);

    public abstract  void showState();
}
