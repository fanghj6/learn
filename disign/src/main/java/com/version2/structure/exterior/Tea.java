package com.version2.structure.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Tea
 * @Description TODO
 * @date 2020/3/19  20:24
 **/
public class Tea {

    private Water water;

    private TeaSet teaSet;

    public Tea() {
        this.water = new Water();
        this.teaSet = new TeaSet();
    }

    public void dispaly(){
        this.water.readyWater();
        this.teaSet.readyTeaSet();
        System.out.println("this is tea");
    }
}
