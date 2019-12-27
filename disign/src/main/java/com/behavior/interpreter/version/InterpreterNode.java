package com.behavior.interpreter.version;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName InterpreterNode
 * @Description TODO
 * @date 2019/12/27  10:05
 **/
public class InterpreterNode implements Node {

    private List<Node> nodes = new ArrayList<>();

    @Override
    public void interpreter(Context context) {

        while (true) {
            if(!context.HasNext()){
                break;
            }
            String value = context.nextValue();
            if(value.equalsIgnoreCase("end")){
                break;
            }
            Node node = null;
            if (value.equalsIgnoreCase("loop")) {
                 node = new LoopInterpreterNode();
                node.interpreter(context);
            } else {
                 node = new ResultInterpreterNode();
                node.interpreter(context);
            }
            this.nodes.add(node);
        }
    }

    @Override
    public void execute() {
        ListIterator<Node> iterator = this.nodes.listIterator();
        while (iterator.hasNext()){
            iterator.next().execute();
        }
    }
}
