package com.disign.test.singleton.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName B
 * @Description TODO
 * @date 2019/9/6  11:30
 **/
public class B extends A {

    public void test2(){
        System.out.println("b test 2");
        test1();
    }
}
