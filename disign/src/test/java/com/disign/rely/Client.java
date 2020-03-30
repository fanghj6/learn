package com.disign.rely;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/27  15:43
 **/
public class Client {

    public static void main(String[] args) {
        TestA testA = new TestA("a");
        TestB testB = new TestB("b");
        testA.setTestB(testB);
        testB.setTestA(testA);

        System.out.println(testA.getName());

    }
}
