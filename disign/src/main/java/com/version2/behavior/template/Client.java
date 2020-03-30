package com.version2.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/26  11:14
 **/
public class Client {

    public static void main(String[] args) {
        //模板方法模式
        //角色：抽象类，具体子类

        Conversion xml = new XmlConversion();
        xml.templateMethod();

        System.out.println("==============");
        Conversion ordinary = new Ordinary();
        ordinary.templateMethod();
    }
}
