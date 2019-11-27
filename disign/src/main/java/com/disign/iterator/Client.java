package com.disign.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  迭代器测试
 * @date 2019/9/27  9:27
 **/
public class Client {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        list.add("test6");
        AbstractList<String> productList = new ProductList<>(list);
        productList.add("test7");
        productList.remove("test7");
        AbstractIterator<String> iterator = productList.createIterator();

        System.out.println("first= "+iterator.first());
        System.out.println("first= "+iterator.last());
        while (iterator.hasNext()){
            String value = iterator.next();
            if(value.equalsIgnoreCase("test3")){
                iterator.remove();
            }
            System.out.println("value = "+value);
        }
        System.out.println(list.contains("test2"));
        System.out.println(list.contains("test3"));
    }
}
