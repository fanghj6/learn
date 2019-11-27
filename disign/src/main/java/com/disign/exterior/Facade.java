package com.disign.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Facade
 * @Description TODO
 * @date 2019/8/16  16:13
 **/
public class Facade implements IFreezing{


    private Freezer freezer = new Freezer();

    private ColdRoom coldRoom = new ColdRoom();

    @Override
    public void init (){
        coldRoom.init();
        freezer.init();
    }
    @Override
    public void run(){
        coldRoom.run();
        freezer.run();
    }
    @Override
    public void shutdown(){
        coldRoom.shutdown();
        freezer.shutdown();
    }
}
