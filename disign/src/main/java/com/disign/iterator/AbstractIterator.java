package com.disign.iterator;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbstractIterator
 * @Description TODO 抽象迭代器
 * @date 2019/9/27  9:02
 **/
public abstract class AbstractIterator<T> {

    private AbstractList abstractList;

    private List<T> list ;

    private int position;

    public AbstractIterator(AbstractList abstractList) {
        this.abstractList = abstractList;
        this.list = abstractList.getList();
        this.position = -1;
    }

    /**
     * 是否有下一个
     * @return
     */
    public boolean hasNext(){
       return this.position+1 < list.size();
    }

    /**
     * 获取下一个
     * @return
     */
    public T next(){
        ++ this.position;
        return list.get(this.position);
    }

    /**
     * 获取最后一个
     * @return
     */
    public T last(){
        return list.get(list.size()-1);
    }

    /**
     * 获取第一个
     * @return
     */
    public T first(){
        return list.get(0);
    }

    /**
     * 删除
     * @return
     */
    public void remove(){

        list.remove(this.position);
        --this.position;
    }


}
