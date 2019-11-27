package com.disign.command.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  命令模式
 * @date 2019/9/22  16:08
 **/
public class Client {

    public static void main(String[] args) throws Exception {
        CalculatorForm calculatorForm = new CalculatorForm();

        AbstractCommand command = new ConcreteCommand();
        calculatorForm.setAbstractCommand(command);

        calculatorForm.execute(10);
        calculatorForm.execute(5);
        calculatorForm.execute(6);
        calculatorForm.execute(26);
        calculatorForm.undo();
        calculatorForm.restore();

    }
}
