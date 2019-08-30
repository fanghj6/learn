package com.disign.disign.adapter.version2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName MysqlAdapter
 * @Description TODO
 * @date 2019/8/30  15:14
 **/
public class MysqlAdapter implements Target {

    private Adaptee adaptee;

    public MysqlAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean request(User user) {
        this.adaptee.saveUser(user);
        return true;
    }


}
