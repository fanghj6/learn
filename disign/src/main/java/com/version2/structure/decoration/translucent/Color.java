package com.version2.structure.decoration.translucent;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Color
 * @Description TODO
 * @date 2020/3/19  18:29
 **/
public class Color extends Decorator {
    public Color(Component component) {
        super(component);
    }

    @Override
    public void dispaly() {
        setColor();
        super.dispaly();
    }

    private void setColor(){
        System.out.println("set color is red");
    }

    public void removeColor (){
        System.out.println("remove color");
    }
}
