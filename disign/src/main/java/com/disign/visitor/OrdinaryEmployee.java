package com.disign.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryEmployee
 * @Description TODO  普通员工
 * @date 2019/11/20  15:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdinaryEmployee implements Employee {

    private String name;

    private double weeklyWage;

    private int workTime;

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
