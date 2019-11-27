package com.disign.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Caretaker
 * @Description TODO
 * @date 2019/9/29  20:53
 **/
public class Caretaker {

    private List<Memorandum> list = new ArrayList<>();

    private int position = -1;

    public void setMemorandum(Memorandum memorandum){
        ++ this.position;
        list.add(this.position,memorandum);
    }

    public Memorandum back(){

        if(this.position <= 0){return null;}
        list.remove(this.position);
        --this.position;
        return list.get(this.position);
    }
}
