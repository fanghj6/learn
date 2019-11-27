package com.disign.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName 冷冻室
 * @Description TODO
 * @date 2019/8/16  16:20
 **/
public class Freezer implements IFreezing{

    @Override
    public void init (){
        System.out.println("Freezer init");
    }
    @Override
    public void run(){
        System.out.println("Freezer run");
    }
    @Override
    public void shutdown(){
        System.out.println("Freezer shutdown");
    }
}
