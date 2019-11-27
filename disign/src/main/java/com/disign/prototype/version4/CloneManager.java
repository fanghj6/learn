package com.disign.prototype.version4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fhj
 * @version 1.0
 * @ClassName CloneManager
 * @Description TODO
 * @date 2019/8/27  9:55
 **/
public class CloneManager {

    private Map<String,Object> map = new HashMap<>();

    public Object clone(String key){
        AbsClone absClone = (AbsClone) map.get(key);
        return absClone.clone();
    }

    public void add(String key,Object obj){
        map.put(key,obj);
    }
}
