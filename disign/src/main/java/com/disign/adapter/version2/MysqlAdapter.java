package com.disign.adapter.version2;

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
