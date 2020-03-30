package com.version2.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Text
 * @Description TODO
 * @date 2020/3/23  18:31
 **/
public class Text extends Component {
    @Override
    public void update() {
        System.out.println("Text update");
    }

    public void select() {
        System.out.println("Text select");
    }

}
