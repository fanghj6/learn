package com.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuildVipProduct
 * @Description TODO
 * @date 2019/12/20  16:17
 **/
public class BuildVipProduct extends Builder {

    public BuildVipProduct() {
        this.product = new Product();
    }

    @Override
    void buildProductId() {
        this.product.setId(2);
    }

    @Override
    void buildProductName() {
        this.product.setName("vipProduct");
    }
}
