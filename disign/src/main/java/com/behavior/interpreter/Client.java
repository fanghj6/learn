package com.behavior.interpreter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 解释器模式， 角色：抽象表达式，终结表达式，非终结表达式，环境类
 * @date 2019/12/26  15:14
 **/
public class Client {

    public static void main(String[] args) {
        ExpressionHander expressionHander = new ExpressionHander();
        Context context = new Context("left move 5 and right move 3 and up move 10 and down move 8");
        expressionHander.operator(context);
        System.out.println(expressionHander.getResult());
    }
}
