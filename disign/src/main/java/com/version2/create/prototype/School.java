package com.version2.create.prototype;

import java.io.Serializable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName School
 * @Description TODO
 * @date 2020/3/17  21:58
 **/
public class School implements Serializable {

    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
