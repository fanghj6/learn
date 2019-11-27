package com.disign.obServer.version2;

import lombok.Data;
import java.util.Observable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName rescueSubject
 * @Description TODO 营救目标
 * @date 2019/11/18  16:01
 **/
@Data
public class RescueSubject extends Observable {

    private String name;


    public RescueSubject(String name) {
        this.name = name;
    }

    public void notifyServer(String helpName) {
        System.out.println(helpName+":被攻击");
        setChanged();
        notifyObservers(helpName);
    }
}
