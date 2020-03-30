package com.version2.behavior.visit;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HrVisitory
 * @Description TODO
 * @date 2020/3/26  11:41
 **/
public class HrVisitory implements Visitor {
    @Override
    public void visit(NormalEmployee normalEmployee) {
        System.out.println(normalEmployee.getName()+": 工作"+normalEmployee.getTime()+"小时，按人事部门正式工计算工资");
    }

    @Override
    public void visit(TemporaryEmployee temporaryEmployee) {
        System.out.println(temporaryEmployee.getName()+": 工作"+temporaryEmployee.getTime()+"小时，按人事部门临时工计算工资");

    }
}
