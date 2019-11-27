package com.disign.interpreter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName CommandNode
 * @Description TODO
 * @date 2019/9/24  20:44
 **/
public class CommandNode extends Node {

    private Node node;

    @Override
    public void interpret(Context context) {
        //处理LOOP循环命令
        if (context.getCurrentToken().equals("LOOP")) {
            node = new LoopCommandNode();
            node.interpret(context);
        }
        //处理其他基本命令
        else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
