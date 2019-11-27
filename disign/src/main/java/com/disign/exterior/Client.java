package com.disign.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/16  16:29
 **/
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.init();
        facade.run();
        facade.shutdown();
    }
}
