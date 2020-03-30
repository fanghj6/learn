package com.version2.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LeaderHander
 * @Description TODO
 * @date 2020/3/20  20:33
 **/
public class LeaderHander extends Hander {


    @Override
    public void handerLeave(Leave leave) {
        if(leave.getDay()<=7){
            System.out.println("leader ratify");
        }else {
            this.hander.handerLeave(leave);
        }
    }
}
