package com.disign.iterator;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbstractList
 * @Description TODO  抽象聚合类
 * @date 2019/9/27  8:55
 **/
public abstract class AbstractList<T> {

    private List<T> list;

    public AbstractList(List<T> list) {
        this.list = list;
    }

    /**
     * 添加
     * @param t
     */
    public void add(T t){
        list.add(t);
    }

    /**
     * 删除
     */
    public void remove(T t){
        list.remove(t);
    }

    /**
     * 获取所有对象
     * @return
     */
    public List getList(){
        return this.list;
    }

    /**
     * 创建迭代器
     * @return
     */
    public abstract AbstractIterator createIterator();

}
