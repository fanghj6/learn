package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Command
 * @Description TODO  抽象命令类
 * @date 2019/12/3  9:11
 **/
public abstract class Command {

    protected Processor processor;

    public abstract void execute();
}
