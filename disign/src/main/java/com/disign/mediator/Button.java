package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Button
 * @Description TODO
 * @date 2019/9/29  10:46
 **/
public class Button extends Component {

    public Button(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("点击按钮");
    }
}
