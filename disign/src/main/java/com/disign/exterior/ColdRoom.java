package com.disign.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName 冷藏室
 * @Description TODO
 * @date 2019/8/16  16:20
 **/
public class ColdRoom implements IFreezing {

    @Override
    public void init (){
        System.out.println("ColdRoom init");
    }
    @Override
    public void run(){
        System.out.println("ColdRoom run");
    }
    @Override
    public void shutdown(){
        System.out.println("ColdRoom shutdown");
    }
}
