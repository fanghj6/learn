package com.version2.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LazySingleton
 * @Description TODO 懒汉模式
 * @date 2020/3/17  17:59
 **/
public class LazySingleton {

    private   LazySingleton (){}

    private static LazySingleton lazySingleton = null;

    public static LazySingleton newInstance(){
        if(lazySingleton == null){

            synchronized (LazySingleton.class){
                if(lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }

        }
        return lazySingleton;
    }
}
