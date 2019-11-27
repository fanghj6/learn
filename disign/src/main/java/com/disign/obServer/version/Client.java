package com.disign.obServer.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  观察者模式
 * @date 2019/11/18  16:24
 **/
public class Client {

    public static void main(String[] args) {
        Observer pandaObserver = new PandaObserver("panda");
        Observer elephantObserver = new ElephantObserver("elephant");

        Subject subject = new RescueSubject("animal");
        subject.add(pandaObserver);
        subject.add(elephantObserver);
        subject.notifyServer("panda");

    }
}
