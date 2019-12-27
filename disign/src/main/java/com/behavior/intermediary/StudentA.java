package com.behavior.intermediary;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName StudentA
 * @Description TODO
 * @date 2019/12/27  14:45
 **/
@Data
public class StudentA extends Student{


    @Override
    public void operator() {
        System.out.println("添加数据");
    }
}
