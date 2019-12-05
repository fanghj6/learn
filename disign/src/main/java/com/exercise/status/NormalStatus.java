package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NormalStatus
 * @Description TODO 正常状态
 * @date 2019/12/5  14:16
 **/
public class NormalStatus extends Status {

    @Override
    public void changeStatus(Context context) {
        Account account = context.getAccount();
        if(account.getAmt()<0 && account.getAmt()>-2000){
            context.setStatus(new OverdraftStatus());
        }if(account.getAmt()<=-2000){
            context.setStatus(new RestrictedStatus());
        }
    }
}
