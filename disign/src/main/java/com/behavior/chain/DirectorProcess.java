package com.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DirectorProcess
 * @Description TODO
 * @date 2019/12/26  10:02
 **/
public class DirectorProcess extends AbsProcess {
    @Override
    void operator(String name, int num) {
        System.out.println("董事长审批成功");
    }
}
