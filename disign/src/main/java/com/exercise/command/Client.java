package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  命令模式
 * @date 2019/12/3  9:22
 **/
public class Client {

    public static void main(String[] args) {

        Command lightCommand = new LightCommand();
        Command refrigeratorCommand = new RefrigeratorCommand();

        Caller caller = new Caller();
        caller.addCommand(lightCommand);
        caller.addCommand(refrigeratorCommand);
        caller.execute();

    }
}
