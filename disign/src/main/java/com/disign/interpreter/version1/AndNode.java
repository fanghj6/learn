package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AndNode
 * @Description TODO  and 解释
 * @date 2019/9/23  21:11
 **/
public class AndNode extends AbstractNode{

    private AbstractNode left;

    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpreter() {
        return left.interpreter() + "再"+right.interpreter();
    }


}
