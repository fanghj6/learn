package com.disign.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FinanceDepartment
 * @Description TODO  财务部
 * @date 2019/11/20  15:12
 **/
public class FinanceDepartment implements Department {
    @Override
    public void visit(OrdinaryEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        } else if (workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");
    }

    @Override
    public void visit(TemporaryEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
