package com.disign.obServer.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ElephantObserver
 * @Description TODO
 * @date 2019/11/18  16:25
 **/
public class ElephantObserver  implements Observer{

    private String name;

    public ElephantObserver(String name) {
        this.name = name;
    }


    @Override
    public void help() {
        System.out.println(getName() + ":帮忙来了");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
