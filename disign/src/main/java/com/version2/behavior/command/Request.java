package com.version2.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Rquest
 * @Description TODO
 * @date 2020/3/21  20:29
 **/
public class Request {

    private Command command;

    public Request(Command command) {
        this.command = command;
    }

    public void request(){
        command.execute();
    }
}
