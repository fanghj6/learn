package com.version2.behavior.iterator;


/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductIterator
 * @Description TODO
 * @date 2020/3/23  17:58
 **/
public class ProductIterator extends Iterator {

    private Collection collection;

    private int index = 0;

    public ProductIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        if(index< collection.getList().size()){
            return true;
        }
        return false;
    }

    @Override
    public Product next() {
        return collection.getProduct(index++);
    }
}
