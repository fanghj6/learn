package com.disign.assemble.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Folder
 * @Description TODO
 * @date 2019/9/3  22:10
 **/
public class Folder extends File {

    private List<File> list = new ArrayList<>();

    public Folder(String name) {
        super.name = name;
    }


    public void addChild(File file) {
        list.add(file);
    }


    public boolean remove(File file) {
        return list.remove(file);
    }


    public File getChild(int i) {

        return list.get(i);
    }

    @Override
    public void scan() {
        super.scan();
        for (File file : list) {
            file.scan();
        }
    }
}
