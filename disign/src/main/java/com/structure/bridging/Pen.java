package com.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Pen
 * @Description TODO
 * @date 2019/12/23  9:42
 **/
public class Pen extends Painting{

    public Pen() {
        this.name ="毛笔";
    }

    @Override
    void painting() {
        System.out.println("使用"+this.name);
        this.colour.coloring();
    }
}
