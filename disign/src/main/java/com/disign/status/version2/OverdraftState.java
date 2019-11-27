package com.disign.status.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OverdraftState
 * @Description TODO  透支状态
 * @date 2019/11/19  14:46
 **/
public class OverdraftState extends BookeState {

    public OverdraftState(BookManagerVo bookManagerVo) {
        this.setBookManagerVo(bookManagerVo);
    }

    @Override
    public void conversionStatus(BookManager bookManager) {
        int num =this.getBookManagerVo().getNumber();
        if(num <= 5){
            bookManager.setBookeState(new NormalState(this.getBookManagerVo()));
        }if(num > 7){
            bookManager.setBookeState(new RestrictedState(this.getBookManagerVo()));
        }
    }
}
