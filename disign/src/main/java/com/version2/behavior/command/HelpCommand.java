package com.version2.behavior.command;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HelpCommand
 * @Description TODO
 * @date 2020/3/21  20:19
 **/
public class HelpCommand implements Command{

    public Help help = new Help();
    @Override
    public void execute() {
        help.operator();
    }
}
