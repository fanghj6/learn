package com.disign.single;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SingleClient
 * @Description TODO
 * @date 2019/8/24  21:38
 **/
public class SingleClient {

    public static void main(String[] args) {

        //懒汉式
        System.out.println("===== 懒汉式 ======");
        Single single =  Single.newInstance();
        Single single1 =  Single.newInstance();
        System.out.println("single==single1  :"+(single==single1));
        System.out.println(single.hashCode());
        System.out.println(single1.hashCode());
      //饿汉式
        System.out.println("===== 饿汉式 ======");
        Single2 single2 = Single2.newInstance();
        Single2 single3 = Single2.newInstance();
        System.out.println("single2==single3  :"+(single2==single3));
        System.out.println(single2.hashCode());
        System.out.println(single3.hashCode());
        //饿汉式
        System.out.println("===== IODH技术 ======");
        Single3 single4 = Single3.newInstance();
        Single3 single5 = Single3.newInstance();
        System.out.println("single4==single5  :"+(single4==single5));
        System.out.println(single4.hashCode());
        System.out.println(single5.hashCode());

    }


}
