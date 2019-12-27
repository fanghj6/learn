package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DirectionExpression
 * @Description TODO
 * @date 2019/12/26  16:02
 **/
public class DirectionExpression implements Expression {

    public static final  String UP="up";

    public static final  String DOWN="down";

    public static final  String LEFT="left";

    public static final  String RIGHT="right";

    private String value;

    public DirectionExpression(String value) {
        this.value = value;
    }

    @Override
    public String operator() {
        String str = "无效指令";
        if(DirectionExpression.UP.equalsIgnoreCase(this.value)){
            str = "向上";
        }else if(DirectionExpression.DOWN.equalsIgnoreCase(this.value)){
            str = "向下";
        }else if(DirectionExpression.LEFT.equalsIgnoreCase(this.value)){
            str = "向左";
        }else if(DirectionExpression.RIGHT.equalsIgnoreCase(this.value)){
            str = "向右";
        }
        return str;
    }
}
