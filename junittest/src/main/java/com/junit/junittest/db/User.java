package com.junit.junittest.db;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String career;

    public User(Integer id, String name, Integer age, String career) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.career = career;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }
}