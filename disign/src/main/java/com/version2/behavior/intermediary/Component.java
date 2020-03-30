package com.version2.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO
 * @date 2020/3/23  18:21
 **/
public abstract class Component {

    public abstract void update();

    public void change(Intermediary intermediary) {
        intermediary.operation(this);
    }
}
