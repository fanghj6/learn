package com.version2.behavior.resolve;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Direction
 * @Description TODO
 * @date 2020/3/21  20:54
 **/
public class Direction implements Resolve {

    private String name;

    public Direction(String name) {
        this.name = name;
    }

    @Override
    public String  execute() {
        String str = "";
        if("up".equals(this.name)){
            str = "向上";
        }else if("down".equals(this.name)){
            str = "向下";
        }else if ("left".equals(this.name)){
            str = "向左";
        }else if ("right".equals(this.name)){
            str = "向右";
        }else{
            throw  new RuntimeException("命令错误");
        }
        return str;
    }
}
