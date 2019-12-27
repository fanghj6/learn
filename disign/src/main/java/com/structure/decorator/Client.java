package com.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 装饰器模式：角色抽象构件，具体构件，抽象装饰器，具体装饰器
 * 透明装饰器 ：针对抽象编程，不增加额外的方法，可多次装饰
 * 半透明装饰器：针对实现编程，装饰器实现类会增加额外的方法，不可多次装饰
 * @date 2019/12/23  11:13
 **/
public class Client {

    public static void main(String[] args) {
        Buildproduct buildproduct = new BuildPen();
        Decorator decorator = new DecoratorPen(buildproduct);
        decorator.create();
        System.out.println("================");
        Decorator decorator2 = new DecoratorPen(decorator);
        decorator2.create();
    }
}
