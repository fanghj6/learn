package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Account
 * @Description TODO
 * @date 2020/3/24  19:41
 **/
public class Account {

    private String name;

    private double deposit;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", deposit=" + deposit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
