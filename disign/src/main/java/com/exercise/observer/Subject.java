package com.exercise.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Subject
 * @Description TODO
 * @date 2019/12/4  16:27
 **/
public abstract class Subject<T> {

    protected List<Observer> list = new ArrayList<>();

    public void add(Observer observer){
        list.add(observer);
    }

    public void del(Observer observer){
        list.remove(observer);
    }

    public abstract void notfiy(T t);
}
