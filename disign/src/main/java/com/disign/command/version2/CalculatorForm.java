package com.disign.command.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName CalculatorForm  计算机窗口：请求发送者
 * @Description TODO
 * @date 2019/9/22  15:50
 **/
public class CalculatorForm {


    private AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public void execute(int args){
        this.abstractCommand.execute(args);

    }

    public void undo(){
         this.abstractCommand.undo();
    }

    /**
     *  断电恢复状态
     */
    public   void restore() throws Exception{
        this.abstractCommand.restore();
    }
}
