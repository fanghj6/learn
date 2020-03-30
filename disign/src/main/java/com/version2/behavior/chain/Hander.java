package com.version2.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/20  20:29
 **/
public abstract class Hander {

    protected Hander hander;

    public void setHander(Hander hander) {
        this.hander = hander;
    }

    public abstract void handerLeave(Leave leave);
}
