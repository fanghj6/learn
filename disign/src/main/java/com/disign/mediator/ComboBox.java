package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ComboBox
 * @Description TODO
 * @date 2019/9/29  10:45
 **/
public class ComboBox extends Component {
    public ComboBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("下拉框添加  玩玩");
    }

    public void select() {
        System.out.println("下拉框选中  李四");
    }
}
