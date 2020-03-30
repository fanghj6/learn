package com.version2.structure.decoration.translucent;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Decorator
 * @Description TODO
 * @date 2020/3/19  18:19
 **/
public  class Decorator implements Component {

    private Component component;

    public  Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void dispaly() {
        this.component.dispaly();
    }
}
