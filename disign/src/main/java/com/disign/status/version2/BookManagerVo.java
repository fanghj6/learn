package com.disign.status.version2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BookManagerVo
 * @Description TODO   借书管理Vo
 * @date 2019/11/19  15:38
 **/
@Data
public class BookManagerVo {

    public BookManagerVo() {
        this.number = 0;
        this.maxNum = 8;
        this.list = new ArrayList<>();
    }

    /**
     * 当前借书数量
     */
    private int number;

    /**
     * 借书最大数量
     */
    private int maxNum ;

    /**
     * 借书集合
     */
    private List<Book> list;
}
