package com.disign.adapter.version3;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adaptee 适配者抽象类
 * @Description TODO
 * @date 2019/8/30  14:20
 **/
public abstract class Adaptee {

    public abstract boolean saveUser(User user);

    /**
     * 钩子方法（可选择是否使用）
     */
    public void test(){

    }
}
