package com.version2.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/21  20:05
 **/
public class Client {

    public static void main(String[] args) {
        //命令模式
        //请求者，抽象命令类，具体命令类，接收者

        Hander hander = new Hander();

        Command help = new HelpCommand();
        Command minimize = new MinimizeCommand();

        Request requestHelp = new Request(help);
        Request requestMinimize = new Request(minimize);

        hander.setCompnent("功能1",requestHelp);
        hander.setCompnent("功能2",requestMinimize);

        hander.getCompnent("功能1").request();
        hander.getCompnent("功能2").request();
    }
}
