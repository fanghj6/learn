package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ActionNode
 * @Description TODO  移动解释
 * @date 2019/9/23  21:21
 **/
public class ActionNode extends  AbstractNode{
    private String action;

    public ActionNode(String action) {
        this.action = action;

    }

    @Override
    public String interpreter() {
        String  str= "无效指令";
        if(action.equalsIgnoreCase("move")){
            str = "移动";
        }else if(action.equalsIgnoreCase("run")){
            str = "快速移动";
        }
        return str;
    }
}
