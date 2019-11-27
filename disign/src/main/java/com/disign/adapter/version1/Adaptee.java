package com.disign.adapter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adaptee
 * @Description TODO
 * @date 2019/8/29  14:23
 **/
public class Adaptee {

    public boolean saveUser(User user){
        System.out.println("save"+user);
        return true;

    }
}
