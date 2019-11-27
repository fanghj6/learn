package com.disign.interpreter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PrimitiveCommandNode
 * @Description TODO
 * @date 2019/9/24  20:48
 **/
public class PrimitiveCommandNode extends Node {

    private String name;
    private String text;
    @Override
    public void interpret(Context context) {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!name.equals("PRINT") && !name.equals("BREAK") && !name.equals("SPACE")) {
            System.err.println("非法命令！");
        }
        if (name.equals("PRINT")) {
            text = context.getCurrentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equals("PRINT")) {
            System.out.print(text);
        } else if (name.equals("SPACE")) {
            System.out.print(" ");
        } else if (name.equals("BREAK")) {
            System.out.println();
        }
    }
}