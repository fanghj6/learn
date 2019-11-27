package com.disign.status.version2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Book
 * @Description TODO
 * @date 2019/11/19  14:23
 **/
@Data
@Slf4j
public class BookManager {

    /**
     * 当前状态
     */
    private BookeState bookeState;

    public BookManager() {
        this.bookeState = new NormalState(new BookManagerVo());
    }


    /**
     * 借书
     */
    public void borrow(Book book){
        log.info("借书  book={}",book);
        bookeState.borrow(book);
        bookeState.conversionStatus(this);
        log.info("当前数量 number = {}",bookeState.getBookManagerVo().getNumber());
        log.info("当前状态 number = {}",bookeState.getClass().getSimpleName());
    }

    /**
     * 还书
     */
    public void also(Book book){
        log.info("还书  book={}",book);
        bookeState.also(book);
        bookeState.conversionStatus(this);
        log.info("当前数量 number = {}",bookeState.getBookManagerVo().getNumber());
        log.info("当前状态 number = {}",bookeState.getClass().getSimpleName());
    }
}
