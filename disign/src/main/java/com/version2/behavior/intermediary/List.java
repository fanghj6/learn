package com.version2.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName List
 * @Description TODO
 * @date 2020/3/23  18:25
 **/
public class List extends Component {
    @Override
    public void update() {
        System.out.println("list update");
    }

    public void select() {
        System.out.println("list select");
    }

}
