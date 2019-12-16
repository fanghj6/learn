package com.exercise.cloneable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/16  14:42
 **/
public class Client {

    public static void main(String[] args) throws Exception {

        TestCloneAble testCloneAble = new TestCloneAble();
        testCloneAble.setTest("testable");

        //浅克隆
        Student student = new Student();
        student.setName("lishi");
        student.setTestCloneAble(testCloneAble);

        Student student1 = (Student) student.clone();
        System.out.println("student name=name ："+(student.getName().hashCode()==student1.getName().hashCode()));
        System.out.println("student TestCloneAble=TestCloneAble  :"+(student.getTestCloneAble()== student1.getTestCloneAble()));
        System.out.println("student :"+student);
        System.out.println("student1 :"+student1);

        //深克隆
        Product product = new Product();
        product.setName("lishi");
        product.setTestCloneAble(testCloneAble);

        Product product1 = (Product) product.clone();
        System.out.println("product name=name :"+(product.getName().hashCode()==product1.getName().hashCode()));
        System.out.println("product TestCloneAble=TestCloneAble :"+(product.getTestCloneAble()== product1.getTestCloneAble()));
        System.out.println("product :"+product);
        System.out.println("product1 :"+product1);



    }
}
