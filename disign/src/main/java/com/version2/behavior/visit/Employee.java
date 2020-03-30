package com.version2.behavior.visit;

import java.util.Objects;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Employee
 * @Description TODO
 * @date 2020/3/26  11:22
 **/
public abstract class Employee {

    private String name;

    private String time;

    public Employee(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public abstract void visit(Visitor visitor);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                time.equals(employee.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time);
    }
}
