package com.disign.adapter.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName User
 * @Description TODO
 * @date 2019/8/29  14:21
 **/
public class User {

    private String name;

    private Double age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}
