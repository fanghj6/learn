package com.disign.iterator;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductList
 * @Description TODO  商品聚合类
 * @date 2019/9/27  9:16
 **/
public class ProductList<T> extends AbstractList {

    public ProductList(List list) {
        super(list);
    }

    /**
     * 创建迭代器
     * @return
     */
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
