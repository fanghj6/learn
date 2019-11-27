package com.disign.adapter.version3;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OracleAdaptee
 * @Description TODO
 * @date 2019/8/30  14:26
 **/
public class OracleAdaptee extends Adaptee {

    @Override
    public boolean saveUser(User user) {

        System.out.println("save oracle "+user);

        return true;
    }
}
