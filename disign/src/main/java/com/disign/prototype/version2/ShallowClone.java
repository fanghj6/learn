package com.disign.prototype.version2;

import com.disign.prototype.common.User;

/**
 * @author fhj
 * @version 1.0
 * @ClassName shallowClone   jdk浅克隆
 * @Description TODO
 * @date 2019/8/27  9:21
 **/
public class ShallowClone implements Cloneable {

    private User user;

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
