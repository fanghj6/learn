package com.version2.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Clan
 * @Description TODO
 * @date 2020/3/24  18:20
 **/
public class Clan extends Target {
    public Clan(String name) {
        super(name);
    }

    @Override
    public void notifyObserver(String name) {
        for (Observer observer : list) {
            if(!observer.getName().equals(name)){
                observer.update();
            }
        }
    }
}
