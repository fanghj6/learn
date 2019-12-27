package com.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ManagerProcess
 * @Description TODO
 * @date 2019/12/26  10:00
 **/
public class ManagerProcess extends AbsProcess {
    @Override
    void operator(String name, int num) {
        if(num <= 15){
            System.out.println("经理审批成功");
        }else {
            this.absProcess.operator(name,num);
        }
    }
}
