package com.disign.memo;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Memorandum
 * @Description TODO
 * @date 2019/9/29  20:51
 **/
public class Memorandum {

    private String lable;

    private int x ;

    private int y ;

    public Memorandum(String lable, int x, int y) {
        this.lable = lable;
        this.x = x;
        this.y = y;
    }

    public String getLable() {
        return lable;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
