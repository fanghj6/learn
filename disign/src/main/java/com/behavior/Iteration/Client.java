package com.behavior.Iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 迭代器模式，角色：抽象聚合，具体聚合，抽象迭代，具体迭代
 * @date 2019/12/27  14:13
 **/
public class Client {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("product1",""));
        list.add(new Product("product2",""));
        list.add(new Product("product3",""));
        list.add(new Product("product4",""));
        list.add(new Product("product5",""));
        list.add(new Product("product6",""));

        ListIterator<Product> iterator = list.listIterator();
        //正向
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===================");
        //逆向
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
