package com.disign.decorate.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/4  23:47
 **/
public class Client {

    public static void main(String[] args) {

        //半透明装饰器模式
        Component component = new TextBox();
        BlackShow blackShow = new BlackShow(component);
        blackShow.alert();
        BlueShow blueShow = new BlueShow(blackShow);
        blueShow.show();

    }
}
