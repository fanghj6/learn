package com.version2.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Builder
 * @Description TODO
 * @date 2020/3/17  22:30
 **/
public abstract class Builder {

    protected Pen pen;

    public abstract void createPen();

    public abstract void builderCore();

    public abstract void builderShell();

    public abstract void builderCover();

    public boolean isCover(){
        return  true;
    }

    public Pen result(){
        return pen;
    }
}
