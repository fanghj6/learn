package com.create.builder;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Director
 * @Description TODO
 * @date 2019/12/20  16:18
 **/
@Data
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public Product buildProduct(){
        builder.buildProductId();
        builder.buildProductName();
        return builder.getProduct();
    }
}
