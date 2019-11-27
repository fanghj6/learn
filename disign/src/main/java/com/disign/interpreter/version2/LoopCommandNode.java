package com.disign.interpreter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LoopCommandNode
 * @Description TODO
 * @date 2019/9/24  20:45
 **/
public class LoopCommandNode extends Node {

    /**
     * 循环次数
     */
    private int number;

    /**
     * 循环语句中的表达式
     */
    private Node commandNode;

    @Override
    public void interpret(Context context) {
        context.skipToken("LOOP");
        number=context.currentNumber();
        context.nextToken();
        //循环语句中的表达式
        commandNode=new ExpressionNode();
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for(int i=0;i<number;i++) {
            commandNode.execute();
        }
    }
}
