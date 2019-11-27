package com.disign.single;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Single2 饿汉式
 * @Description TODO
 * @date 2019/8/24  21:44
 **/
public class Single2 {

    //1.私有化构造函数
    private Single2(){}
    //2.定义静态本类变量
    private static  volatile  Single2 single2 = new Single2();
    //3.定义静态获取本类对象方法
    public static  Single2 newInstance(){
        return single2;
    }
}
