package com.disign.assemble.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName File
 * @Description TODO
 * @date 2019/9/3  22:02
 **/
public abstract class File {

    public String name;

    public void scan(){
        System.out.println("==========扫描中======="+this.name);
    }

    public String getName() {
        return name;
    }
}
