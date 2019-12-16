package com.exercise.cloneable;

import lombok.Data;

import java.io.*;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Product
 * @Description TODO
 * @date 2019/12/16  14:29
 **/
@Data
public class Product implements Cloneable,Serializable{

    private String name;

    private TestCloneAble testCloneAble;


    @Override
    protected Object clone() throws CloneNotSupportedException {

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
     return null;
    }
}
