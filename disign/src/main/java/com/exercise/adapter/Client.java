package com.exercise.adapter;

import java.io.FileNotFoundException;
/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  对象适配器
 * @date 2019/12/11  14:49
 **/
public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        Operation operation = new Operation();
        Target target = new Adapter(operation);
        Double result = target.request("100","200");
        System.out.println(result);
    }
}
