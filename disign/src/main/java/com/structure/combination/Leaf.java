package com.structure.combination;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Leaf
 * @Description TODO
 * @date 2019/12/23  10:28
 **/
public class Leaf extends File {

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void antivirus() {
        System.out.println("文件杀毒："+this.name);
    }
}
