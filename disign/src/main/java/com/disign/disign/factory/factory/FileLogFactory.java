package com.disign.disign.factory.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FileLogFactory
 * @Description TODO
 * @date 2019/8/21  9:43
 **/
public class FileLogFactory implements Factory {

    @Override
    public Log createLog() {
        return new FileLog();
    }
}
