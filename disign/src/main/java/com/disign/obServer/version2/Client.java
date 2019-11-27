package com.disign.obServer.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  观察者模式
 * @date 2019/11/18  16:24
 **/
public class Client {

    public static void main(String[] args) {
        PandaObserver pandaObserver = new PandaObserver("panda");
        ElephantObserver elephantObserver = new ElephantObserver("elephant");

        RescueSubject subject = new RescueSubject("animal");
        subject.addObserver(pandaObserver);
        subject.addObserver(elephantObserver);
        subject.notifyServer("elephant");

    }
}
