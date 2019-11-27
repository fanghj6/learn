package com.disign.command.version1;

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
        int result = this.abstractCommand.execute(args);
        System.out.println("执行结果 result="+result+ " args ="+args);
    }

    public void undo(){
        int result = this.abstractCommand.undo();
        System.out.println("撤销结果 result="+result);
    }
}
