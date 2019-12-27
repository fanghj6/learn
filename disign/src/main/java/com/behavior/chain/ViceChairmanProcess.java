package com.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ViceChairman
 * @Description TODO
 * @date 2019/12/26  10:09
 **/
public class ViceChairmanProcess extends AbsProcess {
    @Override
    void operator(String name, int num) {
        if(num <= 30){
            System.out.println("副董事长审批成功");
        }else {
            this.absProcess.operator(name,num);
        }
    }
}
