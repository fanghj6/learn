package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SentenceNode
 * @Description TODO  处理解释
 * @date 2019/9/23  21:14
 **/
public class SentenceNode extends AbstractNode{

    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
    public String interpreter() {
        return direction.interpreter()+action.interpreter()+distance.interpreter();
    }
}
