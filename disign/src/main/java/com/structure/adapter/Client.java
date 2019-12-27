package com.structure.adapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 适配器模式：角色：目标，适配器，适配者
 *  类适配器：适配器和适配者是继承关系
 *  对象适配器：适配器和适配者是组合关系
 *  双向适配器：两边都可以适配
 *  默认适配器：适配器增加一个抽象层，抽象适配器角色处理不需要适配的方法提供空实现，
 * @date 2019/12/23  9:23
 **/
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new Operation());
        int result = target.add("10","20");
        System.out.println(result);
    }
}
