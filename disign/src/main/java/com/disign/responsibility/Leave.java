package com.disign.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Leave
 * @Description TODO 请假实体类
 * @date 2019/9/18  21:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
    /**
     * 编号
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 请假天数
     */
    private Double number;
    /**
     * 请假原因
     */
    private String content;

}
