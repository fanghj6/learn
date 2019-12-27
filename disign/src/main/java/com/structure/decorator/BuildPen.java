package com.structure.decorator;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BuildPen
 * @Description TODO
 * @date 2019/12/23  11:08
 **/
public class BuildPen implements Buildproduct {
    @Override
    public void create() {
        System.out.println("制造钢笔");
    }
}
