package com.version2.structure.birdge;

/**
 * @author fhj
 * @version 1.0
 * @ClassName WritingBrush
 * @Description TODO
 * @date 2020/3/18  20:21
 **/
public class WritingBrush extends Pen {
    @Override
    public void handwriting() {
        System.out.println(this.color.setColor()+" witingbrush");
    }
}
