package com.version2.behavior.command;


import java.util.HashMap;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/21  20:24
 **/
public class Hander {

    private HashMap<String,Request> list = new HashMap<>();

    public  Request getCompnent(String key) {
        return list.get(key);
    }

    public void setCompnent(String key, Request request) {
        this.list.put(key,request);
    }
}
