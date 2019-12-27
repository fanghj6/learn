package com.structure.flyweight;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FlyweightFactory
 * @Description TODO
 * @date 2019/12/23  14:29
 **/
@Data
public class FlyweightFactory {


    public static void operator(Flyweight flyweight){
        flyweight.operator();
    }
}
