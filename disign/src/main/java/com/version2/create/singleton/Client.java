package com.version2.create.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/17  18:09
 **/
public class Client {

    public static void main(String[] args) {
        //单例模式
        //角色：单例

        //饿汗
        HungrySingleton hungrySingleton1 = HungrySingleton.newInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.newInstance();
        System.out.println("hungry : "+(hungrySingleton1==hungrySingleton2));
        //懒汉
        LazySingleton lazySingleton1 = LazySingleton.newInstance();
        LazySingleton lazySingleton2 = LazySingleton.newInstance();
        System.out.println("lazy :"+(lazySingleton1==lazySingleton2));
        //内部内
        InternalSingleton internalSingleton1 = InternalSingleton.newInstance();
        InternalSingleton internalSingleton2 = InternalSingleton.newInstance();
        System.out.println("internal :"+(internalSingleton1==internalSingleton2));
    }
}
