package com.version2.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ChairManHander
 * @Description TODO
 * @date 2020/3/20  20:37
 **/
public class ChairManHander extends Hander {


    @Override
    public void handerLeave(Leave leave) {
        if(leave.getDay()>7){
            System.out.println("chair ratify");
        }
    }
}
