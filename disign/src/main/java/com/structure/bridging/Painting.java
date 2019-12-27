package com.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Painting
 * @Description TODO
 * @date 2019/12/23  9:35
 **/
public abstract class Painting {

    protected String name;

    protected Colour colour;

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    abstract void painting();
}
