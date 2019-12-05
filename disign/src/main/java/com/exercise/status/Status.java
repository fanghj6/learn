package com.exercise.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Status
 * @Description TODO
 * @date 2019/12/5  14:07
 **/
public abstract class Status {

    public abstract void changeStatus(Context context);

    public void save(Context context,Double amt){
         Account account = context.getAccount();
         account.setAmt(account.getAmt()+amt);
         changeStatus(context);
    }

    public void take(Context context,Double amt){
         Account account = context.getAccount();
         account.setAmt(account.getAmt()-amt);
         changeStatus(context);
    }
}
