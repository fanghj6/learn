package com.version2.behavior.observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Observer
 * @Description TODO
 * @date 2020/3/24  18:20
 **/
public interface Observer {

    String getName();

    void setName(String name);

    void update();

    void help(Target target);
}
