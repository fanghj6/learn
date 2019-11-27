package com.disign.builder.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuilderA
 * @Description TODO
 * @date 2019/8/28  9:19
 **/
public class BuilderB extends Builder {
    @Override
    public void BuildName() {
        product.setName("产品B");
    }

    @Override
    public void BuildDes() {
        product.setDes("产品B描述");
    }

    @Override
    protected boolean isDes() {
        return false;
    }
}
