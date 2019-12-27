package com.behavior.intermediary;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 终结者模式，角色：抽象终结者，具体终结者，抽象同事，具体同事
 * @date 2019/12/27  14:53
 **/
public class Client {

    public static void main(String[] args) {
        CommunicationIntermediary intermediary = new CommunicationIntermediary();
        StudentA studentA = new StudentA();
        StudentB studentB = new StudentB();

        intermediary.setStudentA(studentA);
        intermediary.setStudentB(studentB);

        studentA.execute(intermediary);
        System.out.println("===================");
        studentB.execute(intermediary);

        System.out.println(studentA);
        System.out.println(studentB);
        System.out.println(intermediary);
    }
}
