package com.version2.behavior.resolve.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LoopNode
 * @Description TODO
 * @date 2020/3/22  20:05
 **/
public class LoopNode implements Resolve {

    private Resolve resolve;

    private int number;

    @Override
    public void builder(Context context) {
        this.number = Integer.valueOf(context.nextToken());
        this.resolve = new Hander();
        this.resolve.builder(context);

    }

    @Override
    public void execute() {
        for (int i=0;i<number;i++ ) {
            resolve.execute();
        }
    }
}
