package com.version2.structure.combination.transparent;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Component
 * @Description TODO
 * @date 2020/3/19  9:35
 **/
public interface File {

    void add(File component);



    void remove(File component);

    List<File> getChild();

    void antivirus();
}
