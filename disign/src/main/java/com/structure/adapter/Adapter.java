package com.structure.adapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2019/12/23  9:20
 **/
public class Adapter implements Target {

    private Operation operation;

    public Adapter(Operation operation) {
        this.operation = operation;
    }

    @Override
    public int add(String a, String b) {
        //适配原来不符合的接口
        return this.operation.add(Integer.valueOf(a),Integer.valueOf(b));
    }
}
