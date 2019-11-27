package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DirectionNode
 * @Description TODO  方向解释
 * @date 2019/9/23  21:15
 **/
public class DirectionNode extends AbstractNode{

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpreter() {
        String str = "无效指令";
        if(direction.equalsIgnoreCase("up")){
            str = "向上";
        }else if(direction.equalsIgnoreCase("down")){
            str = "向下";
        }else if(direction.equalsIgnoreCase("left")){
            str = "向左";
        }else if(direction.equalsIgnoreCase("right")){
            str = "向右";
        }
        return str;
    }
}
