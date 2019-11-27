package com.disign.assemble;

/**
 * @author fhj
 * @version 1.0
 * @ClassName File
 * @Description TODO
 * @date 2019/9/3  22:02
 **/
public abstract class File {

    public String name;

    public  void addChild(File file){
        System.out.println("==========未实现 addChild ======="+this.name);
    }

    public  boolean remove(File file){
        System.out.println("==========未实现 remove ======="+this.name);
        return false;
    }

    public  File getChild(int i){
        System.out.println("==========扫未实现 getChild ======="+this.name);
        return null;
    }

    public void scan(){
        System.out.println("==========扫描中======="+this.name);
    }

    public String getName() {
        return name;
    }
}
