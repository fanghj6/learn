package com.disign.command.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  命令模式
 * @date 2019/9/22  16:08
 **/
public class Client {

    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();

        AbstractCommand command = new ConcreteCommand();
        calculatorForm.setAbstractCommand(command);

        calculatorForm.undo();
        calculatorForm.execute(10);
        calculatorForm.execute(5);
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.execute(20);
        calculatorForm.execute(10);
        calculatorForm.execute(5);
        calculatorForm.execute(8);
        calculatorForm.execute(9);
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();

    }
}
