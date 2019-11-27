package com.disign.command.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbstractCommand
 * @Description TODO
 * @date 2019/9/22  15:50
 **/
public interface AbstractCommand {

    /**
     * 累加
     * @param args
     * @return
     */
     int execute(int args);

    /**
     * 撤销
     */
    int undo();
}
