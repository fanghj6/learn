package com.version2.structure.decoration.transparent;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Frame
 * @Description TODO
 * @date 2020/3/19  18:19
 **/
public class Frame extends Decorator {

    public Frame(Component component) {
        super(component);
    }

    @Override
    public void dispaly() {
        setFrame();
        super.dispaly();
    }

    private void setFrame(){
        System.out.println("set black frame");
    }
}
