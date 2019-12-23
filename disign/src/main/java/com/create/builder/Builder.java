package com.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Builder
 * @Description TODO
 * @date 2019/12/20  16:12
 **/
public abstract class Builder {

    protected Product product ;

     abstract void buildProductId();

     abstract void buildProductName();

    public Product getProduct() {
        return product;
    }
}
