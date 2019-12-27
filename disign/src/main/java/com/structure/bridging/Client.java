package com.structure.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 桥接模式，抽象类，扩充抽象类，实现类接口，具体实现类
 * @date 2019/12/23  9:31
 **/
public class Client {

    public static void main(String[] args) {

        Colour colour = new BlueColor();

        Painting painting = new Pen();
        painting.setColour(colour);
        painting.painting();

    }
}
