package com.structure.flyweight.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 享元模式，角色：抽象享元，具体享元，非共享具体享元，享元工厂
 * 单纯享元：所有具体享元类都是可共享的，不存在非共享享元类
 * 复合享元：将单纯享元对象使用组合模式加以组合，不能共享，可以分解成单纯享元对象
 * @date 2019/12/23  14:22
 **/
public class Client {

    public static void main(String[] args) {

        FlyweightFactory factory = FlyweightFactory.newInstance();
        Flyweight black = factory.getFlyweight("black");
        Flyweight white = factory.getFlyweight("white");

        black.display(new Coordinate(1,1));
        white.display(new Coordinate(2,3));
    }
}
