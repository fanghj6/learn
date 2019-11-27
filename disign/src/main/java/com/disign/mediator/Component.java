package com.disign.mediator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO  抽象组件类
 * @date 2019/9/29  10:47
 **/
public abstract class Component {
    public Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 转发调用
     */
     public void changed(){
         mediator.componentChanged(this);
     }

    public abstract void update();
}
