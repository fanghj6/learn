package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Text
 * @Description TODO
 * @date 2019/9/29  10:45
 **/
public class Text extends Component{


    public Text(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("清空文本显示");
    }

    public void select() {
        System.out.println("文本显示  李四");
    }

}
