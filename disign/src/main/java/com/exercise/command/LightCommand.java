package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName LightCommand
 * @Description TODO
 * @date 2019/12/3  9:14
 **/
public class LightCommand extends Command {

    public LightCommand() {
        this.processor = new LifhtProcessor();
    }

    @Override
    public void execute() {
        this.processor.processor();
    }
}
