package com.disign.responsibility;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ManagerApproval
 * @Description TODO 经理审批
 * @date 2019/9/18  21:57
 **/
public class ManagerApproval extends LeaveApproval {
    @Override
    public void leave(Leave leave) {
        if(leave.getNumber()<=30){
            System.out.println("经理审批通过 leave = "+leave);
        }else{
            this.HandlingLeave(leave);
        }
    }
}
