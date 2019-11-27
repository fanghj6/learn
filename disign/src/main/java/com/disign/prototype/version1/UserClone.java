package com.disign.prototype.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName UserClone
 * @Description TODO
 * @date 2019/8/27  9:14
 **/
public class UserClone implements TestClone {

    private String id;

    private String name;

    private String age;
    @Override
    public TestClone clone() {
        return new UserClone();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
