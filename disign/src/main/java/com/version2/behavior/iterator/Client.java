package com.version2.behavior.iterator;

import java.util.ListIterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/23  17:47
 **/
public class Client  {

    public static void main(String[] args) {
        //迭代模式
        //角色：抽线聚合类，具体聚合类，抽线迭代器，具体迭代器

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Collection collection = new ProductCollection();
        collection.setProduct(product1);
        collection.setProduct(product2);
        collection.setProduct(product3);
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===========================");
        //jdk 自带iterator
       ListIterator<Product> iter = collection.getList().listIterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
