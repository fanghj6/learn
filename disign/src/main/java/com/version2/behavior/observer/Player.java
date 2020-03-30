package com.version2.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Player
 * @Description TODO
 * @date 2020/3/24  19:20
 **/
public class Player implements Observer {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name+" 来支援了");
    }

    @Override
    public void help(Target target) {
        System.out.println(this.name+"受到攻击");
        target.notifyObserver(this.name);
    }
}
