package com.disign.obServer.version;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName subject
 * @Description TODO
 * @date 2019/11/18  15:53
 **/
@Data
public abstract class Subject {


    private String name;

    private List<Observer> list;

    public Subject(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }


//注册

    public void add(Observer observer){
        this.list.add(observer);
    }

    //删除
    public boolean del(Observer observer){
       return this.list.remove(observer);
    }
    //通知

    public abstract void notifyServer(String name);
}
