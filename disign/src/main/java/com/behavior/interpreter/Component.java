package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO
 * @date 2019/12/26  16:41
 **/
public class Component implements Expression{

    private DirectionExpression directionExpression;

    private MoveExpression moveExpression;

    private DistanceExpression distanceExpression;

    public Component(DirectionExpression directionExpression, MoveExpression moveExpression, DistanceExpression distanceExpression) {
        this.directionExpression = directionExpression;
        this.moveExpression = moveExpression;
        this.distanceExpression = distanceExpression;
    }


    @Override
    public String operator() {
        return this.directionExpression.operator()+this.moveExpression.operator()+this.distanceExpression.operator()+"\n";
    }
}
