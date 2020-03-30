package com.disign.rely;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestB
 * @Description TODO
 * @date 2019/12/27  15:42
 **/
@Data
public class TestB {

    public TestB(String name) {
        this.name = name;
    }

    private String name;

    private TestA testA;
}
