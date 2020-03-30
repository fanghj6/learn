package com.version2.structure.fiyweight;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbsFiyweight
 * @Description TODO
 * @date 2020/3/20  9:34
 **/
public abstract class ChessFiyweight {

    protected   Color color;

    public abstract void setColor(Color color);

    public abstract void display(Coordinate coordinate);
}
