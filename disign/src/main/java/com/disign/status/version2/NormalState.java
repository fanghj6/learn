package com.disign.status.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName NormalState
 * @Description TODO  正常状态
 * @date 2019/11/19  14:45
 **/
public class NormalState extends BookeState {


    public NormalState(BookManagerVo bookManagerVo) {
        this.setBookManagerVo(bookManagerVo);
    }

    @Override
    public void conversionStatus(BookManager bookManager) {
        int num =this.getBookManagerVo().getNumber();
        if(num > 5){
            bookManager.setBookeState(new OverdraftState(this.getBookManagerVo()));
        }if(num > 7){
            bookManager.setBookeState(new RestrictedState(this.getBookManagerVo()));
        }
    }
}
