package com.disign.interpreter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/23  21:43
 **/
public class Client {

    public static void main(String[] args) {
        String instruction ="up move 5 and down run 10 and left move 5";
        InstructionHandler handler= new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString=handler.output();
        System.out.println(outString);
    }
}
