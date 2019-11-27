package com.disign.builder.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2019/8/28  9:04
 **/
public class Product {

    private String name;

    private String des;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
