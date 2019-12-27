package com.behavior.intermediary;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName CommunicationIntermediary
 * @Description TODO
 * @date 2019/12/27  14:44
 **/
@Data
public class CommunicationIntermediary implements Intermediary{

    private StudentA studentA;

    private StudentB studentB;


    @Override
    public void execute(Student student) {
        if(student == studentA){
            studentA.operator();
            studentB.operator();
        }else if(student == studentB){
            studentB.operator();
        }
    }
}
