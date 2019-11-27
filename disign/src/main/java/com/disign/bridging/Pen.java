package com.disign.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Pen
 * @Description TODO
 * @date 2019/9/3  8:40
 **/
public abstract class Pen {

    protected Pigment  pigment;

    public void setPigment(Pigment pigment) {
        this.pigment = pigment;
    }

    /**
     * 绘画
     */
    public abstract void painting();
}
