package com.disign.rely;

import lombok.Data;
import org.junit.Test;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestA
 * @Description TODO
 * @date 2019/12/27  15:42
 **/
@Data
public class TestA {

    public TestA(String name) {
        this.name = name;
    }

    private String name;

    private TestB testB;
}
