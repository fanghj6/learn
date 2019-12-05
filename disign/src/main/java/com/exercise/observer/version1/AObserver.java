package com.exercise.observer.version1;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AObserver
 * @Description TODO
 * @date 2019/12/4  16:50
 **/
@Data
public class AObserver implements Observer {
    private String name;

    public AObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(!this.name.equals(String.valueOf(arg))){
            System.out.println(this.name+"  来营救了");
        }
    }
}
