package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OverdraftState
 * @Description TODO
 * @date 2020/3/24  19:39
 **/
public class OverdraftState extends State{

    public OverdraftState(Account account) {
        super(account);
    }

    @Override
    public void checkState(Context context) {
        double deposit = this.getAccount().getDeposit();
        if(deposit >= 0){
            context.setState(new NormalState(this.getAccount()));
        }else if(deposit < -2000){
            context.setState(new RestrictedState(this.getAccount()));
        }
    }
    @Override
    public void showState() {
        System.out.println("当前状态：透支");
    }
}
