package com.create.prototype;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 原型模式，角色：抽象原型类，具体原型类
 * @date 2019/12/20  15:48
 **/
public class Client {

    public static void main(String[] args) throws Exception {
        Class cls = new Class();
        cls.setName("12306");
        Student student = new Student();
        student.setName("lishi");
        student.setCls(cls);

        //浅克隆
        Student student1 = student.cloneStudent();
        System.out.println(student == student1);
        System.out.println(student.getName()== student1.getName());
        System.out.println(student.getCls() == student1.getCls());

        System.out.println("=================");
        //深克隆
        Student student2 = student.cloneStu();
        System.out.println(student == student2);
        System.out.println(student.getName()== student2.getName());
        System.out.println(student.getCls() == student2.getCls());
    }
}
