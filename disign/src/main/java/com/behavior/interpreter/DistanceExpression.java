package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DistanceExpression
 * @Description TODO
 * @date 2019/12/26  16:26
 **/
public class DistanceExpression implements Expression {

    private String value;

    public DistanceExpression(String value) {
        this.value = value;
    }

    @Override
    public String operator() {
        return this.value;
    }
}
