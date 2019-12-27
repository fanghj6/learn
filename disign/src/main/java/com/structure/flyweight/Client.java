package com.structure.flyweight;

/**
 * @author fhj
 * @version 1.0    -----------------错误  -------------------   Ｘ　　　X　　　Ｘ
 *
 * @ClassName Client
 * @Description TODO 享元模式，角色：抽象享元，具体享元，非共享具体享元，享元工厂
 * 单纯享元：可多次共享
 * 复合享元：是单纯享元对象的组合，不可多次共享
 * @date 2019/12/23  14:22
 **/
public class Client {

    public static void main(String[] args) {

        FlyweightFactory.operator(new BlackFlyweight("1","1"));

        FlyweightFactory.operator(new WhiteFlyweight("1","2"));
    }
}
