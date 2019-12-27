package com.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  命令模式：角色：抽象命令，具体命令，调用者，接收者
 * @date 2019/12/26  10:26
 **/
public class Client {

    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.setCommand(new MeetingCommand());
        caller.call("今天下午开会");
    }
}
