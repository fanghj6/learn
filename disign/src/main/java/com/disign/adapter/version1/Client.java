package com.disign.adapter.version1;

import java.math.BigDecimal;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/8/29  14:42
 **/
public class Client {

    public static void main(String[] args) {
        String str = "李四,25";
        Target tareget = new Adapter(new Adaptee());
        boolean result = tareget.saveUser(str);


        BigDecimal bigDecimal = new BigDecimal("100.00");
        String str1 ="0000001200";
        System.out.println(Integer.valueOf(str1));
        System.out.println(String.valueOf(bigDecimal));
    }
}
