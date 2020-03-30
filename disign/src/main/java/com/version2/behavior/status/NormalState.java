package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NormalState
 * @Description TODO
 * @date 2020/3/24  19:37
 **/
public class NormalState extends State {


    public NormalState(Account account) {
        super(account);
    }

    @Override
    public void interest() {

    }

    @Override
    public void checkState(Context context) {
        double deposit = this.getAccount().getDeposit();
        if(deposit<0 && deposit >= -2000){
            context.setState(new OverdraftState(this.getAccount()));
        }else if(deposit < -2000){
            context.setState(new RestrictedState(this.getAccount()));
        }
    }

    @Override
    public void showState() {
        System.out.println("当前状态：正常");
    }
}
