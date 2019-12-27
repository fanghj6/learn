package com.behavior.command;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Caller
 * @Description TODO
 * @date 2019/12/26  10:19
 **/
@Data
public class Caller {

    private Command command;

    public void call(String take){
        command.command(take);
    }

}
