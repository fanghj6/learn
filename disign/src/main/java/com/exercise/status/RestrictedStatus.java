package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RestrictedStatus
 * @Description TODO  受限状态
 * @date 2019/12/5  14:23
 **/
public class RestrictedStatus extends Status{
    @Override
    public void changeStatus(Context context) {
        Account account = context.getAccount();
        if(account.getAmt()>=0){
            context.setStatus(new NormalStatus());
        }if(account.getAmt()<0 && account.getAmt()>-2000){
            context.setStatus(new OverdraftStatus());
        }
    }

    @Override
    public void take(Context context, Double amt) {
        System.out.println("当前账户受限无法取款");
    }
}
