package com.disign.adapter.version1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Adapter
 * @Description TODO
 * @date 2019/8/29  14:22
 **/
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean saveUser(String str) {
        User user = this.builderUser(str);
        this.adaptee.saveUser(user);
        return false;
    }

    private User builderUser(String str)  {
        User user = null;
        try {
            String[] arr = str.split(",");
            Class cs = User.class;
            user = (User) cs.newInstance();
            Field[] fields =  cs.getDeclaredFields();
            for (int i=0;i<fields.length;i++){
                Field field = fields[i];
                String methodName = toUpperCase("set"+field.getName(),3,4);
                Object o = arr[i];
                if(field.getType() != String.class){
                    Method method =field.getType().getMethod("valueOf",String.class);
                     o = method.invoke(null,arr[i]);
                }

                cs.getDeclaredMethod(methodName,field.getType()).invoke(user,o);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return user;
    }

    //str.substring(0,1).toUpperCase()+str.substring(1);

    private String toUpperCase(String str, int start, int end) {

        if(str == null){
            return null;
        }

        String upStr = str.substring(start,end).toUpperCase();

        if(start<=0){
            return upStr+str.substring(end);
        }
        String beforeStr = str.substring(0,start);
        String afterStr =str.substring(end);
        return beforeStr + upStr +afterStr;

    }


}
