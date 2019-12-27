package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName MoveExpression
 * @Description TODO
 * @date 2019/12/26  16:39
 **/
public class MoveExpression implements Expression{

    private String value;

    public MoveExpression(String value) {
        this.value = value;
    }

    @Override
    public String operator() {
        return this.value.equalsIgnoreCase("move")?"移动":"指令错误";
    }
}
