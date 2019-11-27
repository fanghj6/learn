package com.disign.test.singleton;

/**
 * @author fhj
 * @version 1.0
 * @ClassName forTest
 * @Description TODO
 * @date 2019/8/27  10:33
 **/
public class forTest {


    public static void main(String[] args) {
        int b =0;

        for (int i=0;i<3;i++) {


            try {
                b++;
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("异常");
            }
        }
        System.out.println(b);
    }
}
