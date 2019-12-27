package com.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Decorator
 * @Description TODO
 * @date 2019/12/23  11:09
 **/
public abstract class Decorator implements Buildproduct {

    private Buildproduct buildproduct;

    public Buildproduct getBuildproduct() {
        return buildproduct;
    }

    public void setBuildproduct(Buildproduct buildproduct) {
        this.buildproduct = buildproduct;
    }
}
