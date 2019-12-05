package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LifhtProcessor
 * @Description TODO
 * @date 2019/12/3  9:17
 **/
public class LifhtProcessor implements Processor {
    @Override
    public void processor() {
        System.out.println("开灯命令");
    }
}
