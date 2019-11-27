package com.disign.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Director
 * @Description TODO
 * @date 2019/8/28  9:21
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.BuildName();
        builder.BuildDes();
        return builder.getResult();
    }
}
