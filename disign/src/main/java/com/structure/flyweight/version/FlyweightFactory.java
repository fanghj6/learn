package com.structure.flyweight.version;

import lombok.Data;

import java.util.HashMap;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FlyweightFactory
 * @Description TODO
 * @date 2019/12/23  14:29
 **/
public class FlyweightFactory {

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private  HashMap<String,Flyweight> map;

    private FlyweightFactory() {
        map = new HashMap<>();
        map.put("black",new BlackFlyweight());
        map.put("white",new WhiteFlyweight());
    }

    public static FlyweightFactory newInstance(){return flyweightFactory;}

    public Flyweight getFlyweight(String str){

        return this.map.get(str);

    }
}
