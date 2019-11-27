package com.disign.prototype.version2;

import com.disign.prototype.common.User;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/27  9:23
 **/
public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setName("aaaaaaa");
        shallowClone.setUser(new User("李四",30));
        ShallowClone shallowClone1 = (ShallowClone) shallowClone.clone();
        System.out.println(shallowClone1.getName());
        System.out.println(shallowClone1.getUser());
        System.out.println(shallowClone==shallowClone1);
        //result= true,User引用的是同一对象
        System.out.println(shallowClone.getUser()==shallowClone1.getUser());
    }
}
