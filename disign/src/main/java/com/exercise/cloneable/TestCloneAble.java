package com.exercise.cloneable;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestCloneAble
 * @Description TODO
 * @date 2019/12/16  14:30
 **/
@Data
public class TestCloneAble implements Serializable {

    private String test;
}
