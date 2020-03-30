package com.version2.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName InternalSingleton
 * @Description TODO  内部内模式
 * @date 2020/3/17  18:06
 **/
public class InternalSingleton {

    private  InternalSingleton(){}

    static class Internal{
        private static  InternalSingleton internalSingleton = new InternalSingleton();
    }

    public static InternalSingleton newInstance(){
        return Internal.internalSingleton;
    }
}
