package com.disign.single;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Single3 iodh技术
 * @Description TODO
 * @date 2019/8/24  21:51
 **/
public class Single3 {

    //1.私有化构造函数
    private Single3(){}
    //2.定义静态本类变量
    static  class single{
        private static  volatile  Single3 single3 = new Single3();
    }

    //3.定义静态获取本类对象方法
    public static  Single3 newInstance(){
        return single.single3;
    }
}
