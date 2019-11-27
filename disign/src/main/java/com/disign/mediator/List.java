package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName List
 * @Description TODO
 * @date 2019/9/29  10:45
 **/
public class List extends Component {

    public List(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("列表添加  玩玩");
    }

    public void select() {
        System.out.println("列表选中  李四");
    }

}
