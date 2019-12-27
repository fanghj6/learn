package com.behavior.interpreter;

import java.util.Stack;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ExpressionHander
 * @Description TODO
 * @date 2019/12/26  15:16
 **/
public class ExpressionHander {

    private Expression expression;

    public void operator(Context context){
        Stack<Expression> stack=new Stack();
        while (context.HasNext()) {
            context.nextValue();
            if("and".equals(context.getCurrent())){
                Expression left = stack.pop();
                context.nextValue();
                stack.push(new AndExpression(left,createComponent(context)));
            }else{
                stack.push(createComponent(context));
            }

        }
        expression = stack.pop();
    }

    public String getResult(){
        return this.expression.operator();
    }

    private Component createComponent(Context context){
        DirectionExpression directionExpression = new DirectionExpression(context.getCurrent());
        MoveExpression moveExpression = new MoveExpression(context.nextValue());
        DistanceExpression distanceExpression = new DistanceExpression(context.nextValue());
        return new Component(directionExpression,moveExpression,distanceExpression);
    }

}
