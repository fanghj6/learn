package com.disign.interpreter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Node
 * @Description TODO
 * @date 2019/9/24  20:41
 **/
public abstract class Node {

    public abstract void interpret(Context text); //声明一个方法用于解释语句
    public abstract void execute(); //声明一个方法用于执行标记对应的命令
}
