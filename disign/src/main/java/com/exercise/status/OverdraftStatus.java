package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OverdraftStatus
 * @Description TODO 透支状态
 * @date 2019/12/5  14:23
 **/
public class OverdraftStatus extends Status {
    @Override
    public void changeStatus(Context context) {
        Account account = context.getAccount();
        if(account.getAmt()>=0){
            context.setStatus(new NormalStatus());
        }if(account.getAmt()<=-2000){
            context.setStatus(new RestrictedStatus());
        }
    }

}
