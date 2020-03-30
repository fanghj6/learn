package com.version2.structure.decoration.translucent;

import com.disign.exterior.Facade;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/19  18:13
 **/
public class Client {

    public static void main(String[] args) {
        //装饰模式
        //角色：抽象构件，具体构件，抽象装饰类，具体装饰类
        //类型：透明装饰模式/半透明装饰模式

        //半透明装饰类
        Component component = new Text();
        Frame frame = new Frame(component);
        frame.dispaly();
        frame.removeFrame();
        //继续使用frame 装饰将丢失 removeFrame的功能
        Color color = new Color(component);
        color.dispaly();
        color.removeColor();
    }
}
