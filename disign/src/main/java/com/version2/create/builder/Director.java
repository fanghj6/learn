package com.version2.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Director
 * @Description TODO
 * @date 2020/3/17  22:21
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Pen construct(){
        this.builder.createPen();
        this.builder.builderCore();
        this.builder.builderShell();
        this.builder.builderCover();
        return this.builder.result();
    }
}
