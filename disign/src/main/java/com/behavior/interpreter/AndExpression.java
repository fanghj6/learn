package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AndExpression
 * @Description TODO
 * @date 2019/12/26  15:31
 **/
public class AndExpression implements Expression {

    private Expression left;

    private Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String operator() {
        return this.left.operator()+"再"+right.operator();
    }
}
