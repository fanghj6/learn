package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RestrictedState
 * @Description TODO
 * @date 2020/3/24  19:38
 **/
public class RestrictedState extends State{

    public RestrictedState(Account account) {
        super(account);
    }

    @Override
    public void take(double money) {
        System.out.println("受限状态 无法取款 ");
    }

    @Override
    public void checkState(Context context) {
        double deposit = this.getAccount().getDeposit();
        if(deposit >= 0){
            context.setState(new NormalState(this.getAccount()));
        }else if(deposit<0 && deposit >= -2000){
            context.setState(new OverdraftState(this.getAccount()));
        }
    }

    @Override
    public void showState() {
        System.out.println("当前状态：受限");
    }
}
