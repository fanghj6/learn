package com.create.single;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductB
 * @Description TODO
 * @date 2019/12/20  15:24
 **/
@Data
public class ProductB {

    private ProductB(){};

    public static ProductB product = new ProductB();

    public static ProductB newInstance(){
        return ProductB.product;
    }

    private String name;

    public void operator(){
        System.out.println("single："+name);
    }

}
