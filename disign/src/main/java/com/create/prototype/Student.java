package com.create.prototype;

import lombok.Data;

import java.io.*;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Student
 * @Description TODO
 * @date 2019/12/20  15:40
 **/
@Data
public class Student implements Cloneable,Serializable {

    private String name;

    private Class cls;



    public Student cloneStudent() throws Exception {
        return (Student) super.clone();
    }

    public Student cloneStu() {
        //写入流
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        Student student = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            //取出

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            student = (Student) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
        return student;
    }
}
