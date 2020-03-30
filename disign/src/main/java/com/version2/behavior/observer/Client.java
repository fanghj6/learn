package com.version2.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/24  18:16
 **/
public class Client {

    public static void main(String[] args) {
        //观察者模式
        //角色：抽线目标，具体目标，抽象观察者，具体观察者

        Target target = new Clan("测试战队");

        Observer lisi = new Player("李四");
        Observer wanwu = new Player("王五");
        Observer zhaoliu = new Player("赵六");

        target.addObserver(lisi);
        target.addObserver(wanwu);
        target.addObserver(zhaoliu);

        lisi.help(target);
        System.out.println("==================");
        lisi.help(target);
    }
}
