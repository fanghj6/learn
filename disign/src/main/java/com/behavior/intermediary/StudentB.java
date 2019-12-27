package com.behavior.intermediary;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName StudentB
 * @Description TODO
 * @date 2019/12/27  14:51
 **/
@Data
public class StudentB extends Student {
    @Override
    public void operator() {
        System.out.println("修改数据");
    }
}
