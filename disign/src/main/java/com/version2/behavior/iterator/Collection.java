package com.version2.behavior.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Collection
 * @Description TODO
 * @date 2020/3/23  17:50
 **/
public abstract class Collection {

    private List<Product> list = new ArrayList<>();

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Product getProduct(int index){
        return this.list.get(index);
    }

    public void setProduct(Product product){
        this.list.add(product);
    }

    public abstract Iterator iterator();
}
