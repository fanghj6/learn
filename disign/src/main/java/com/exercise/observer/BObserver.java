package com.exercise.observer;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BObserver
 * @Description TODO
 * @date 2019/12/4  16:35
 **/
@Data
public class BObserver implements Observer {
    private String name;

    public BObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String str) {
        if(!this.name.equals(str)){
            System.out.println(this.name+"  来营救了");
        }
    }
}
