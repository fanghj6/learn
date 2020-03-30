package com.version2.behavior.resolve;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName And
 * @Description TODO
 * @date 2020/3/21  20:58
 **/
public class And implements Resolve{

    private Resolve  left;

    private Resolve right ;

    public And(Resolve left, Resolve right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String execute() {
        return left.execute()+right.execute();
    }
}
