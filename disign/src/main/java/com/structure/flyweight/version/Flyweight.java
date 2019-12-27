package com.structure.flyweight.version;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Flyweight
 * @Description TODO
 * @date 2019/12/23  15:02
 **/
@Data
public abstract class Flyweight {

    public abstract String getColor();

    public void display(Coordinate coordinate){
        System.out.println("棋子颜色："+this.getColor()+" x:"+coordinate.getX()+" y:"+coordinate.getY());
    }
}
