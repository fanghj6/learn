package com.version2.create.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuilderPen
 * @Description TODO
 * @date 2020/3/17  22:42
 **/
public class BuilderPen extends Builder {
    @Override
    public void createPen() {
        this.pen = new Pen();
    }

    @Override
    public void builderCore() {
        this.pen.setCore("black  core");
    }

    @Override
    public void builderShell() {
        this.pen.setShell("white shell");
    }

    @Override
    public void builderCover() {
        this.pen.setCover("not cover");
    }
}
