package com.disign.bridging;

/**
 * @author fhj
 * @version 1.0
 * @ClassName WritingBrush
 * @Description TODO
 * @date 2019/9/3  8:47
 **/
public class WritingBrush extends Pen {
    @Override
    public void painting() {
        this.pigment.display();
    }
}
