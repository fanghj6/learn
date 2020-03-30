package com.version2.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PropertiesConfigUtil
 * @Description TODO
 * @date 2020/3/16  20:17
 **/
public class PropertiesConfigUtil {

    public static String getType(String key) {
        Properties properties =new Properties();
        try {
            properties.load(new FileReader("src/main/resources/application.properties"));
            String type = properties.get(key).toString();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object getObject(String key) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String packageName = getType( key);
       Class cls = Class.forName(packageName);
       return  cls.newInstance();
    }
}
