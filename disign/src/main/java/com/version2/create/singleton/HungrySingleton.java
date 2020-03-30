package com.version2.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HungrySingleton
 * @Description TODO 饿汉模式
 * @date 2020/3/17  17:56
 **/
public class HungrySingleton {

    private HungrySingleton(){};

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton  newInstance(){
        return hungrySingleton;
    }
}
