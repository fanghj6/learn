package com.version2.behavior.resolve;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Node
 * @Description TODO
 * @date 2020/3/21  20:59
 **/
public class Node implements Resolve {

    private Resolve direction;

    private Resolve primary ;

    public Node(Resolve direction, Resolve primary) {
        this.direction = direction;
        this.primary = primary;
    }

    @Override
    public String execute() {
         return direction.execute()+primary.execute();
    }
}
