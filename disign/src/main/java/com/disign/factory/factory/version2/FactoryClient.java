package com.disign.factory.factory.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FactoryClient
 * @Description TODO
 * @date 2019/8/21  9:44
 **/
public class FactoryClient {


    public static void main(String[] args) throws Exception {
        Factory factory = (Factory) Class.forName("com.disign.factory.factory.version2.DBLogFactory").newInstance();
        factory.writeLog(" hello test !");
    }
}
