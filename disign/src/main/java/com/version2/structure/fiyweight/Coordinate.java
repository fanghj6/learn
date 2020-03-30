package com.version2.structure.fiyweight;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Coordinate
 * @Description TODO
 * @date 2020/3/20  9:36
 **/
public class Coordinate {

    private String x;

    private String y;

    public Coordinate(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
