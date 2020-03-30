package com.version2.behavior.resolve;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/21  20:40
 **/
public class Client {

    public static void main(String[] args) {
        //解释器模式
        //角色：抽象表达式，终极表达式，非终结表达式，环境类
        //String instruction = "up move 5 and down run 10 and left move 5";

        Hander hander = new Hander();
        hander.init("up move 5 and down run 10 and left move 5 end");
        hander.execute();
    }
}
