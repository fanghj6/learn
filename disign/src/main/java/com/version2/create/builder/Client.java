package com.version2.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/17  22:22
 **/
public class Client {
    public static void main(String[] args) {
        //建造者模式
        //角色: 指挥者，抽象构件者，具体构件者，产品

        Director director = new Director(new BuilderPen());
        Pen pen = director.construct();
        System.out.println(pen);
    }
}
