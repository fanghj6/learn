package com.behavior.intermediary;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Student
 * @Description TODO
 * @date 2019/12/27  14:47
 **/
public abstract class Student {

    public  void execute(Intermediary intermediary){
        intermediary.execute(this);
    }

    public abstract void operator();
}
