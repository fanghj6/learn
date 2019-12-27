package com.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DecoratorPen
 * @Description TODO
 * @date 2019/12/23  11:11
 **/
public class DecoratorPen extends Decorator {

    public DecoratorPen(Buildproduct buildproduct) {
        this.setBuildproduct(buildproduct);
    }

    @Override
    public void create() {
        this.getBuildproduct().create();
        System.out.println("打包装");
    }
}
