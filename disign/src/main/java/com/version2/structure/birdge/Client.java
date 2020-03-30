package com.version2.structure.birdge;

import java.io.File;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/18  20:07
 **/
public class Client {

    public static void main(String[] args) {
        //桥接模式
        //角色：抽象类，扩充抽象类，实现类接口，具体实现类

        Color color = new BlackColor();
        Pen pen = new WritingBrush();
        pen.setColor(color);
        pen.handwriting();

    }
}
