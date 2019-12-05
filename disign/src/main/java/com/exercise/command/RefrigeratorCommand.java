package com.exercise.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RefrigeratorCommand
 * @Description TODO
 * @date 2019/12/3  9:14
 **/
public class RefrigeratorCommand extends Command {

    public RefrigeratorCommand() {
        this.processor = new RefrigeratorProcessor();
    }
    @Override
    public void execute() {
        this.processor.processor();
    }
}
