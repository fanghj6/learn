package com.disign.adapter.version3;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2019/8/30  14:27
 **/
public class Adapter extends  Adaptee implements  Target {

    private Adaptee adaptee;

    private Target target;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter(Target target) {
        this.target = target;
    }


    @Override
    public boolean saveUser(User user) {
        System.out.println("target.request");
        return this.target.request(user);
    }

    @Override
    public boolean request(User user) {
        System.out.println("adaptee.saveUser");
        return this.adaptee.saveUser(user);
    }
}
