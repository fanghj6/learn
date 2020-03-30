package com.version2.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/23  18:19
 **/
public class Client {

    public static void main(String[] args) {

        //中介者模式
        //角色：抽线中介者，具体中介者，抽线同事类，具体同事类
        Button button = new Button();
        List list = new List();
        Combox combox = new Combox();
        Text text = new Text();

        UserInfoIntermediary intermediary = new UserInfoIntermediary();
        intermediary.setButton(button);
        intermediary.setList(list);
        intermediary.setCombox(combox);
        intermediary.setText(text);

        button.change(intermediary);
        System.out.println("=================");
        list.change(intermediary);
        System.out.println("=================");
        combox.change(intermediary);
    }
}
