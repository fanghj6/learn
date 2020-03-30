package com.version2.behavior.resolve;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PrimaryResolve
 * @Description TODO
 * @date 2020/3/21  20:48
 **/
public class Primary implements Resolve {

    private String name;

    private String text;

    public Primary(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String execute() {
        String str = "";
        if("move".equals(this.name)){
            str = "移动"+text;
        }else if("run".equals(this.name)){
            str = "快速移动"+text;
        }else{
            throw  new RuntimeException("命令错误");
        }
        return str;
    }
}
