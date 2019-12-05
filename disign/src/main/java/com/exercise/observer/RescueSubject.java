package com.exercise.observer;

import java.util.Iterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RescueSubject
 * @Description TODO
 * @date 2019/12/4  16:31
 **/
public class RescueSubject  extends Subject<String>{


    @Override
    public void notfiy(String str) {
        Iterator<Observer> iterator = this.list.iterator();
        while (iterator.hasNext()){
            iterator.next().update(str);
        }
    }
}
