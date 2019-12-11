package com.exercise.adapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2019/12/11  14:47
 **/
public class Adapter implements Target {

    private Operation operation;

    public Adapter(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Double request(String a, String b) {
        Double c = Double.valueOf(a);
        Double d = Double.valueOf(b);
        return operation.add(c,d);
    }
}
