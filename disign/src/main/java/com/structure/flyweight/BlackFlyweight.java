package com.structure.flyweight;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BlackFlyweight
 * @Description TODO
 * @date 2019/12/23  15:05
 **/
public class BlackFlyweight extends Flyweight {

    public BlackFlyweight(String x, String y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void operator() {

        System.out.println(this.getClass().getSimpleName()+"  X:"+this.getX()+" Y: "+this.getY());
    }
}
