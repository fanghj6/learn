package com.exercise.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/4  16:40
 **/
public class Client {

    public static void main(String[] args) {
        Subject subject = new RescueSubject();
        AObserver aObserver = new AObserver("aObserver");
        BObserver bObserver = new BObserver("bObserver");
        subject.add(aObserver);
        subject.add(bObserver);
        subject.notfiy( aObserver.getName());
    }
}
