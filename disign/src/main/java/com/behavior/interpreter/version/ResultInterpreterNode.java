package com.behavior.interpreter.version;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ResultInterpreterNode
 * @Description TODO
 * @date 2019/12/27  10:06
 **/
@Data
public class ResultInterpreterNode implements Node {

    private String name;

    private String text;


    @Override
    public void interpreter(Context context) {
        this.name = context.getCurrent();
        if(this.name.equalsIgnoreCase("print") ||
                this.name.equalsIgnoreCase("println")){
            this.text = context.nextValue();
        }

    }

    @Override
    public void execute() {
        if(this.name.equalsIgnoreCase("space")){
            System.out.print(" ");
        }else if(this.name.equalsIgnoreCase("print")){
            System.out.print(this.text);
        }else if(this.name.equalsIgnoreCase("println")){
            System.out.println(this.text);
        }
    }
}
