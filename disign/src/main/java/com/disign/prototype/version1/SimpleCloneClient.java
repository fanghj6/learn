package com.disign.prototype.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SimpleCloneClient
 * @Description TODO
 * @date 2019/8/27  9:16
 **/
public class SimpleCloneClient {


    public static void main(String[] args) {
        TestClone testClone = new UserClone();
        UserClone userClone = (UserClone) testClone.clone();
        UserClone userClone1 = (UserClone) testClone.clone();

        System.out.println(userClone==userClone1);

    }
}
