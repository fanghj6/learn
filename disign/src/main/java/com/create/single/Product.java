package com.create.single;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2019/12/20  15:24
 **/
@Data
public class Product {

    private Product(){};

    public static  Product product;

    public static Product newInstance(){
        if(Product.product == null){
            Product.product = new Product();
        }
        return Product.product;
    }

    private String name;

    public void operator(){
        System.out.println("single："+name);
    }

}
