package com.version2.structure.combination.transparent;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TextFile
 * @Description TODO
 * @date 2020/3/19  9:45
 **/
public class TextFile implements File {
    @Override
    public void add(File component) {
        System.out.println("not support this function");
    }

    @Override
    public void remove(File component) {
        System.out.println("not support this function");
    }

    @Override
    public List<File> getChild() {
        System.out.println("not support this function");
        return null;
    }

    @Override
    public void antivirus() {
        System.out.println("text antivirus");
    }
}
