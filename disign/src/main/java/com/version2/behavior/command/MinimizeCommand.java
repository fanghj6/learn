package com.version2.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName MinimizeCommand
 * @Description TODO
 * @date 2020/3/21  20:17
 **/
public class MinimizeCommand implements Command{

    private Minimize minimize = new Minimize();


    @Override
    public void execute() {
        minimize.operator();
    }
}
