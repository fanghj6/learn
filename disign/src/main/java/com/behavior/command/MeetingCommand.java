package com.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName MeetingCommand
 * @Description TODO
 * @date 2019/12/26  10:22
 **/
public class MeetingCommand implements Command  {

    private Receiver receiver = new Receiver();

    @Override
    public void command(String take) {
        receiver.operator(take);
    }
}
