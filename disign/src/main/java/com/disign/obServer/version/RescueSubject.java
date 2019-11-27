package com.disign.obServer.version;

import org.springframework.util.CollectionUtils;

/**
 * @author fhj
 * @version 1.0
 * @ClassName rescueSubject
 * @Description TODO 营救目标
 * @date 2019/11/18  16:01
 **/
public class RescueSubject extends Subject {

    public RescueSubject(String name) {
        super(name);
    }

    @Override
    public void notifyServer(String helpName) {
        System.out.println(helpName+":被攻击");
        if(!CollectionUtils.isEmpty(this.getList())){
            this.getList().stream().forEach(observer ->{
                if(!helpName.equals(observer.getName())){
                    observer.help();
                }
            });
        }
    }
}
