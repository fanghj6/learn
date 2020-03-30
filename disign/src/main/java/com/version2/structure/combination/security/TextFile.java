package com.version2.structure.combination.security;

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
    public void antivirus() {
        System.out.println("text antivirus");
    }
}
