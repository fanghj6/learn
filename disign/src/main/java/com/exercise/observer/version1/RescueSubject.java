package com.exercise.observer.version1;

import java.util.Observable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RescueSubject
 * @Description TODO
 * @date 2019/12/4  16:47
 **/
public class RescueSubject extends Observable {


    public void notify(Object arg) {
        setChanged();
        notifyObservers(arg);
    }
}
