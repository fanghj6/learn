package com.version2.behavior.memorandum;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Memo
 * @Description TODO
 * @date 2020/3/24  10:02
 **/
public class Memo {

    private String state;


    protected Memo(Primer primer) {
        this.state = primer.getState();
    }

    protected String getState() {
        return state;
    }

    protected void setState(String state) {
        this.state = state;
    }
}
