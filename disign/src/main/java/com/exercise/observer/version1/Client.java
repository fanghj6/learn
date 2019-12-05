package com.exercise.observer.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/4  16:52
 **/
public class Client {

    public static void main(String[] args) {
        RescueSubject rescueSubject = new RescueSubject();
        rescueSubject.addObserver(new AObserver("aObserver"));
        rescueSubject.addObserver(new BObserver("bObserver"));
        rescueSubject.notify("aObserver");
    }
}
