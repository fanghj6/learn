package com.disign.obServer.version2;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PandaObserver
 * @Description TODO
 * @date 2019/11/18  16:16
 **/
@Data
public class PandaObserver  implements Observer {

    private String name;

    public PandaObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(!getName().equals(arg.toString())){
            System.out.println(getName() + ":帮忙来了");
        }
    }

}
