package com.version2.structure.fiyweight;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Chess
 * @Description TODO
 * @date 2020/3/20  9:40
 **/
public class Chess extends ChessFiyweight {


    @Override
    public void setColor(Color color) {
        super.color=color;
    }


    @Override
    public void display(Coordinate coordinate) {
        System.out.println(this.color.setColor()+"象棋x="+coordinate.getX()+"y="+coordinate.getY());
    }
}
