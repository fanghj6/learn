package com.disign.decorate.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/4  23:47
 **/
public class Client {

    public static void main(String[] args) {

        //透明装饰器模式
        Component component,component1,component2;
        component = new TextBox();
        component1 = new BlackShow(component);
        component2 = new BlueShow(component1);

        component2.show();
    }
}
