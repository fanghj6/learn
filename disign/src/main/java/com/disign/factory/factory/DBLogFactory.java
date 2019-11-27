package com.disign.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FileLogFactory
 * @Description TODO
 * @date 2019/8/21  9:43
 **/
public class DBLogFactory implements Factory {

    @Override
    public Log createLog() {
        return new FileLog();
    }
}
