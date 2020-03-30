package com.version2.structure.birdge;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Pen
 * @Description TODO
 * @date 2020/3/18  20:12
 **/
public abstract class Pen {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void handwriting();

}
