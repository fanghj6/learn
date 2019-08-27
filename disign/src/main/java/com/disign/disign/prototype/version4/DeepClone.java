package com.disign.disign.prototype.version4;

import com.disign.disign.prototype.common.User;

import java.io.*;

/**
 * @author fhj
 * @version 1.0
 * @ClassName DeepClone 深克隆
 * @Description TODO
 * @date 2019/8/27  9:32
 **/
public class DeepClone extends AbsClone {

    private String test;

    //实现序列化接口
    private User user;

    @Override
    public AbsClone clone() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream out = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
             //写入
             byteArrayOutputStream = new ByteArrayOutputStream();
             out = new ObjectOutputStream(byteArrayOutputStream);
             out.writeObject(this);

             //读出
             byteArrayInputStream= new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
             objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (AbsClone) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (out != null) {
                    out.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
