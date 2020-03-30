package com.version2.behavior.template;

/**
 * @author fhj
 * @version 1.0
 * @ClassName XmlConversion
 * @Description TODO
 * @date 2020/3/26  11:08
 **/
public class XmlConversion extends Conversion{

    @Override
    protected void getdata() {
        System.out.println("get xmldata");
    }

    @Override
    protected void ConversionXml() {
        System.out.println("conversion xml");
    }

    @Override
    protected boolean isXML() {
        return true;
    }
}
