package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/29  11:12
 **/
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Button button = new Button(mediator);
        Text text = new Text(mediator);
        List list = new List(mediator);
        ComboBox comboBox = new ComboBox(mediator);

        mediator.setButton(button);
        mediator.setComboBox(comboBox);
        mediator.setList(list);
        mediator.setText(text);

        button.changed();
        System.out.println("===========");
        comboBox.changed();
    }
}
