package com.version2.structure.adapter.defaultadapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2020/3/18  18:09
 **/
public class Adapter implements AbsCalculation {

    @Override
    public Double sum(double arg1, double arg2) {
        System.out.println("空实现");
        return null;
    }

    @Override
    public Double difference(double arg1, double arg2) {
        System.out.println("空实现");
        return null;
    }
}
