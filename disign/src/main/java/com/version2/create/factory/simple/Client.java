package com.version2.create.factory.simple;

import com.version2.util.PropertiesConfigUtil;
import org.springframework.context.annotation.PropertySource;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author fhj
 * @version 1.0
 * @ClassName client
 * @Description TODO
 * @date 2020/3/16  19:55
 **/
public class Client {

    public static void main(String[] args) {
        //简单工厂模式
        //角色：静态工厂类，抽象产品，具体产品
        String tyep = PropertiesConfigUtil.getType("simple.type");
        Product book = StaticFactory.createProduct(tyep);
        book.show();

    }




}
