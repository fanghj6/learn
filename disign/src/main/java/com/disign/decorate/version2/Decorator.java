package com.disign.decorate.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Decorator
 * @Description TODO
 * @date 2019/9/4  23:39
 **/
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        this.component.show();
    }
}
