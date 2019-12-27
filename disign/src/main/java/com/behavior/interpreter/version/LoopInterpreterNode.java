package com.behavior.interpreter.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AndInterpreterNode
 * @Description TODO
 * @date 2019/12/27  10:06
 **/
public class LoopInterpreterNode implements Node {

    private int number;

    private Node node;

    @Override
    public void interpreter(Context context) {
        this.number = Integer.valueOf(context.nextValue());
        this.node = new InterpreterNode();
        this.node.interpreter(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            this.node.execute();
        }
    }
}
