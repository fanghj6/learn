package com.version2.behavior.visit;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HrEmployee
 * @Description TODO
 * @date 2020/3/26  11:24
 **/
public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String time) {
        super(name, time);
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }


}
