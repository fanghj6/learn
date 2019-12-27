package com.structure.flyweight.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BlackFlyweight
 * @Description TODO
 * @date 2019/12/23  15:05
 **/
public class WhiteFlyweight extends Flyweight {
    @Override
    public String getColor() {
        return "白色";
    }
}
