package com.disign.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuilderA
 * @Description TODO
 * @date 2019/8/28  9:19
 **/
public class BuilderA extends Builder {
    @Override
    public void BuildName() {
        product.setName("产品A");
    }

    @Override
    public void BuildDes() {
        product.setDes("产品A描述");
    }
}
