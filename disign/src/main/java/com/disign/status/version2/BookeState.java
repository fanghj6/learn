package com.disign.status.version2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fhj
 * @version 1.0
 * @ClassName BookeState
 * @Description TODO
 * @date 2019/11/19  14:22
 **/
@Slf4j
@Data
public abstract class BookeState {

    private BookManagerVo bookManagerVo;

    /**
     * 借书
     */
   public void borrow(Book book){
       int num =this.getBookManagerVo().getNumber();
       if(num < bookManagerVo.getMaxNum()){
           bookManagerVo.getList().add(book);
           bookManagerVo.setNumber(bookManagerVo.getNumber()+1);
       }else{
           System.out.println("借书数量过多==============无法借书");
       }

    }

    /**
     * 还书
     */
   public void also(Book book){
       boolean result = bookManagerVo.getList().remove(book);
       if(result == true){
           bookManagerVo.setNumber(bookManagerVo.getNumber()-1);
           log.info("还书成功=========== book= {}",book);
       }
   }

    /**
     * 状态转换
     */
   public abstract void conversionStatus(BookManager bookManager);
}
