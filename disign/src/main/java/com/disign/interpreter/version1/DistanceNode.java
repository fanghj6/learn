package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DistanceNode
 * @Description TODO 距离解释
 * @date 2019/9/23  21:23
 **/
public class DistanceNode extends AbstractNode{
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpreter() {
        return this.distance;
    }
}
