package com.version2.create.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/17  22:02
 **/
public class Client {

    public static void main(String[] args) {
        //原型模式
        //角色：抽象原型，具体原型

        //浅克隆
        Student student = new Student();
        student.setName("test");
        student.setSex("sir");
        student.setSchool(new School("北京大学"));

        PrintClone(student, student.shallowClone());


        //深克隆
        Student stu = new Student();
        stu.setName("test");
        stu.setSex("sir");
        stu.setSchool(new School("北京大学"));

        PrintClone(stu, student.deepClone());
    }

    private static void PrintClone(Student stu, Student stu1) {
        System.out.println(stu == stu1);
        System.out.println(stu.getName() == stu1.getName());
        System.out.println(stu.getSex() == stu1.getSex());
        System.out.println(stu.getSchool() == stu1.getSchool());
        System.out.println("=======================");
    }
}
