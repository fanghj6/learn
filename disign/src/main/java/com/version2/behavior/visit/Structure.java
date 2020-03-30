package com.version2.behavior.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Structure
 * @Description TODO
 * @date 2020/3/26  11:32
 **/
public class Structure {

    private List<Employee> employees = new ArrayList<>();

    public void addEmp(Employee employee){
        employees.add(employee);
    }
    public void removeEmp(Employee employee){
        employees.remove(employee);
    }

    public void calculation(Visitor visitor){
        for (Employee employee : employees) {
                employee.visit(visitor);

        }
    }
}
