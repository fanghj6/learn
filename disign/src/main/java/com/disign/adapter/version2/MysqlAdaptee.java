package com.disign.adapter.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OracleAdaptee
 * @Description TODO
 * @date 2019/8/30  14:26
 **/
public class MysqlAdaptee implements Adaptee {
    @Override
    public boolean saveUser(User user) {

        System.out.println("save mysql "+user);

        return true;
    }
}
