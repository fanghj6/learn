package com.disign.status.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RestrictedState
 * @Description TODO  受限状态
 * @date 2019/11/19  14:47
 **/
public class RestrictedState extends BookeState{

    public RestrictedState(BookManagerVo bookManagerVo) {
        this.setBookManagerVo(bookManagerVo);
    }
    @Override
    public void borrow(Book book) {
        System.out.println("您借书已达到个人最大数量"+this.getBookManagerVo().getMaxNum()+"，请还书后在借");
    }

    @Override
    public void conversionStatus(BookManager bookManager) {
        int num =this.getBookManagerVo().getNumber();
        if(num <=5 ){
            bookManager.setBookeState(new NormalState(this.getBookManagerVo()));
        }if(num >=6 && num <= 7){
            bookManager.setBookeState(new OverdraftState(this.getBookManagerVo()));
        }
    }
}
