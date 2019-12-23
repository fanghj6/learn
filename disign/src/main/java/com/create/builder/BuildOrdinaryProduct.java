package com.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuildOrdinaryProduct
 * @Description TODO
 * @date 2019/12/20  16:15
 **/
public class BuildOrdinaryProduct extends Builder {

    public BuildOrdinaryProduct() {
        this.product = new Product();
    }

    @Override
    void buildProductId() {
        this.product.setId(1);
    }

    @Override
    void buildProductName() {
        this.product.setName("ordinaryProduct");
    }
}
