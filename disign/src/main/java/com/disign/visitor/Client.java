package com.disign.visitor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/11/20  15:17
 **/
public class Client {

    /**
     * 普通员工每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；
     * 如果超过40小时，超出部分按照100元/小时作为加班费；如果少于40小时，
     * 请假所扣工资以80元/小时计算，所缺时间按照请假处理，直到基本工资扣除到零为止。
     * 除了记录实际工作时间外，
     * 人力资源部需记录加班时长或请假时长，作为员工平时表现的一项依据。
     *
     * 临时工每周工作时间不固定，基本工资按小时计算，不同岗位的临时工小时工资不同。
     * 人力资源部只需记录实际工作时间。
     * @param args
     */
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee fte1,fte2,fte3,pte1,pte2;
        fte1 = new OrdinaryEmployee("张无忌",3200.00,45);
        fte2 = new OrdinaryEmployee("杨过",2000.00,40);
        fte3 = new OrdinaryEmployee("段誉",2400.00,38);
        pte1 = new TemporaryEmployee("洪七公",80.00,20);
        pte2 = new TemporaryEmployee("郭靖",60.00,18);
        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);
        Department dep = new FinanceDepartment();
        list.accept(dep);
        System.out.println("===================================");
         dep = new PersonnelDepartment();
        list.accept(dep);
    }
}
