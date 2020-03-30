package com.version2.structure.adapter.defaultadapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SumAdapter
 * @Description TODO
 * @date 2020/3/18  17:42
 **/
public class SumAdapter extends Adapter implements Target {

    /**
     * 求和
     * @param arg1
     * @param arg2
     * @return
     *
     *  适配接口方法
     */
    @Override
    public Double sum(double arg1, double arg2){
        return arg1+arg2;
    }

    @Override
    public String request(String arg1,String arg2) {
        //适配参数不一致情况
        double sum = this.sum(Double.valueOf(arg1),Double.valueOf(arg2));
        return String.valueOf(sum);
    }
}
