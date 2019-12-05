package com.exercise.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Caller
 * @Description TODO 调用者
 * @date 2019/12/3  9:09
 **/
public class Caller {

    private List<Command> list = new ArrayList<>();

    public void execute(){
        Iterator<Command> iterator = this.list.iterator();
        while (iterator.hasNext()){
            iterator.next().execute();
        }
    }

    public void addCommand(Command command) {
        this.list.add( command);
    }
}
