package com.version2.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName XmlConversion
 * @Description TODO
 * @date 2020/3/26  10:56
 **/
public abstract class Conversion {

    protected abstract void getdata();

    protected void ConversionXml(){
    }

    protected boolean isXML(){
        return false;
    }

    public void templateMethod(){
        getdata();
        if(isXML()){
            ConversionXml();
        }
        display();
    }

    protected void display(){
        System.out.println(" display data");
    }
}
