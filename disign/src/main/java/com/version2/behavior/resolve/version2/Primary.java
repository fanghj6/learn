package com.version2.behavior.resolve.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Primary
 * @Description TODO
 * @date 2020/3/22  20:00
 **/
public class Primary implements Resolve{

    private String command;

    private String text;

    @Override
    public void builder(Context context) {
        this.command = context.currentToken();
            if("PRINT".equals(context.currentToken())){
                this.text = context.nextToken();
            }
    }

    @Override
    public void execute() {
        if("PRINT".equals(command)){
            System.out.print(this.text);
        }else if("SPACE".equals(command)){
            System.out.print(" ");
        }else if("BREAK".equals(command)){
            System.out.println();
        }
    }
}
