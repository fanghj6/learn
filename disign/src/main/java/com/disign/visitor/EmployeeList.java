package com.disign.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName EmployeeList
 * @Description TODO
 * @date 2019/11/20  15:08
 **/
public class EmployeeList {

    private List<Employee>  list = new ArrayList<>();

    public void accept(Department department){
        for (Employee employee : list) {
            employee.accept(department);
        }
    }


    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }
}
