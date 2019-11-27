package com.disign.adapter.version3;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/30  14:30
 **/
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new OracleAdaptee();
        Target target = new Adapter(adaptee);
        boolean result = target.request(new User("李四",12));
        System.out.println(result);
    }

}
