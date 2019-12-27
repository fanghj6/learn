package com.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Folder
 * @Description TODO
 * @date 2019/12/23  10:30
 **/
public class Folder extends File{

    public Folder(String name) {
        this.name = name;
    }

    private List<File> files = new ArrayList<>();

    public void delete(File file) {
        files.remove(file);
    }

    public void add(File file) {
        this.files.add(file);
    }

    @Override
    void antivirus() {
        System.out.println("文件夹杀毒："+this.name);
        this.files.stream().forEach(file -> {
            file.antivirus();
        });
    }
}
