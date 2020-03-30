package com.version2.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Target
 * @Description TODO
 * @date 2020/3/24  18:20
 **/
public abstract class Target {

    protected List<Observer> list = new ArrayList<>();

    private String name;

    public Target(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public abstract void notifyObserver(String name);

}
