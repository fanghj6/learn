package com.disign.decorate.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BlackShow
 * @Description TODO
 * @date 2019/9/4  23:43
 **/
public class BlueShow extends Decorator {


    public BlueShow(Component component) {
        super(component);
    }

    @Override
    public void show() {
        this.configColor();
        super.show();
    }

    private void configColor(){
        System.out.println(" 配置蓝色 ");
    }
}
