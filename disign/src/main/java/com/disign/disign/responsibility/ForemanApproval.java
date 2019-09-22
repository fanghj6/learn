package com.disign.disign.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ForemanApproval
 * @Description TODO  领班审批
 * @date 2019/9/18  21:57
 **/
public class ForemanApproval extends LeaveApproval{
    @Override
    public void leave(Leave leave) {
        if(leave.getNumber()<=7){
            System.out.println("领班审批通过 leave = "+leave);
        }else{
            this.HandlingLeave(leave);
        }
    }
}
