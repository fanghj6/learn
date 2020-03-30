package com.version2.structure.combination.security;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ImageComponent
 * @Description TODO
 * @date 2020/3/19  9:48
 **/
public class ImageFile implements File {

    @Override
    public void antivirus() {
        System.out.println("Image antivirus");
    }
}
