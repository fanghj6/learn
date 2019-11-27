package com.disign.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Department
 * @Description TODO  部门
 * @date 2019/11/20  14:59
 **/
public interface Department {

    /**
     * 计算普通员工工资
     * @param employee
     */
    void visit(OrdinaryEmployee employee);

    /**
     * 计算临时工工资
     * @param employee
     */
    void visit(TemporaryEmployee employee);
}
