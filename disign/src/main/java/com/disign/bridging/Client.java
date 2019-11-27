package com.disign.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/3  8:47
 **/
public class Client {

    public static void main(String[] args) {
        //桥接模式解决一个类中有多维度变化，每个维度可独立相互扩展
        Pigment blue = new Blue();
        Pigment pink = new Pink();
        Pen pen = new WritingBrush();
        pen.setPigment(blue);
        pen.painting();
        pen.setPigment(pink);
        pen.painting();
    }
}
