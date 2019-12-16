package com.exercise.cloneable;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Student
 * @Description TODO
 * @date 2019/12/16  14:28
 **/
@Data
public class Student implements Cloneable{

    private int id;

    private String name;

    private TestCloneAble testCloneAble;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
