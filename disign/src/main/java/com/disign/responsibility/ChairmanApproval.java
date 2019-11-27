package com.disign.responsibility;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ChairmanApproval
 * @Description TODO 董事长审批
 * @date 2019/9/18  21:58
 **/
public class ChairmanApproval extends LeaveApproval {
    @Override
    public void leave(Leave leave) {
        if(leave.getNumber()<=90){
            System.out.println("经理审批通过 leave = "+leave);
        }else{
            this.HandlingLeave(leave);
        }
    }
}
