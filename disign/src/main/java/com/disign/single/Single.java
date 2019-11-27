package com.disign.single;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Single 懒汉式
 * @Description TODO
 * @date 2019/8/24  21:29
 **/
public class Single {

    //1.私有化构造函数
    private Single(){ }

    //2.定义静态本类对象
    private static volatile Single single;
    //3.定义静态获取方法

    public static Single newInstance(){
        //双重检查锁
        if(single == null){
            synchronized (Single.class){
                if(single == null){
                single = new Single();
                }
            }
        }

        return single;
    }

}
