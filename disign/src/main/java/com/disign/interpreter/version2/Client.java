package com.disign.interpreter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/24  20:54
 **/
public class Client {

    public static void main(String[] args) {
//        String text="LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 BREAK";
//        Context context=new Context(text);
//        Node node = new ExpressionNode();
//        node.interpret(context);
//        node.execute();

        String text="LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 BREAK";
        Context context=new Context(text);
        Node node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}
