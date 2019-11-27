package com.disign.responsibility;

import lombok.Setter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LeaveApproval
 * @Description TODO 请假审批
 * @date 2019/9/18  21:53
 **/
public abstract class LeaveApproval {

    @Setter
    protected LeaveApproval leaveApproval;

    protected void HandlingLeave(Leave leave){
        if(leaveApproval == null){
            System.out.println("直接开除 leave = "+leave);
        }else{
            leaveApproval.leave(leave);
        }
    }
    /**
     * 请假
     * @param leave
     */
    public abstract void  leave(Leave leave);
}
