package com.version2.behavior.iterator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductCollection
 * @Description TODO
 * @date 2020/3/23  18:08
 **/
public class ProductCollection extends Collection {
    @Override
    public Iterator iterator(){
        Iterator iterator = new ProductIterator(this);
        return iterator;
    }
}
