package com.version2.behavior.memorandum;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Primer
 * @Description TODO
 * @date 2020/3/24  10:02
 **/
public class Primer {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memo createMemo(){
        return new Memo(this);
    }

    public void revoke(Memo memo){
        this.state = memo.getState();
    }
}
