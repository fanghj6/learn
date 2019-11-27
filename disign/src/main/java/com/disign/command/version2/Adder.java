package com.disign.command.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adder
 * @Description TODO
 * @date 2019/9/22  15:59
 **/
public class Adder {

    public int value = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public  int add(int args){
        return value += args;
    }
}
