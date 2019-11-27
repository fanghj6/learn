package com.disign.prototype.version3;

import com.disign.prototype.common.User;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/27  9:49
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        //深拷贝，完全复制，所有对象都是全新的，和原对象没有任何关联
        DeepClone deepClone = new DeepClone();
        deepClone.setTest("aaaaaaa");
        deepClone.setUser(new User("李四",30));
        DeepClone deepClone1 = (DeepClone) deepClone.clone();
        System.out.println(deepClone1.getTest());
        System.out.println(deepClone1.getUser());
        System.out.println(deepClone1==deepClone);
        System.out.println(deepClone1.getUser()==deepClone.getUser());

    }
}
