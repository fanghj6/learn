package com.version2.structure.combination.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Folder
 * @Description TODO
 * @date 2020/3/19  9:42
 **/
public class Folder implements File {

    public List<File> list = new ArrayList<>();

    @Override
    public void add(File component) {
        list.add(component);
    }

    @Override
    public void remove(File component) {
        list.remove(component);
    }

    @Override
    public List<File> getChild() {
        return this.list;
    }

    @Override
    public void antivirus() {
        for (File component : list) {
            component.antivirus();
        }
    }
}
