package com.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Receiver
 * @Description TODO
 * @date 2019/12/26  10:19
 **/
public class Receiver {
    public void operator(String take) {
        System.out.println("接收到的命令："+take);
    }
}
