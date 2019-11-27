package com.disign.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FactoryClient
 * @Description TODO
 * @date 2019/8/21  9:44
 **/
public class FactoryClient {


    public static void main(String[] args) {
        Factory factory = new FileLogFactory();
        Log log = factory.createLog();
        log.writeLog(" hello test !");
    }
}
