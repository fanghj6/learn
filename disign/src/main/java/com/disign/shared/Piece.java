package com.disign.shared;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Piece
 * @Description TODO
 * @date 2019/9/8  15:45
 **/
public abstract class Piece {

    void display(Coordinates coordinates){
        System.out.println("棋子颜色："+this.getColor()+" 坐标 X="
                +coordinates.getX()+" Y="+coordinates.getY());
    }

    abstract String getColor();
}
