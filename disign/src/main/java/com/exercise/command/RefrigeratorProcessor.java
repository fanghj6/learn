package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RefrigeratorProcessor
 * @Description TODO
 * @date 2019/12/3  9:18
 **/
public class RefrigeratorProcessor implements Processor {
    @Override
    public void processor() {
        System.out.println("开冰箱命令");
    }
}
