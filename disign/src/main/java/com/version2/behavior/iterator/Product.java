package com.version2.behavior.iterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2020/3/23  17:51
 **/
public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
