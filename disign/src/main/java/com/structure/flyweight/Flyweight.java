package com.structure.flyweight;

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


    private String x;

    private String y;

    public abstract void operator();
}
