package com.version2.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName StaticFactory
 * @Description TODO
 * @date 2020/3/16  19:57
 **/
public class StaticFactory {


    public static Product createProduct(String type){
        if("book".equals(type)){

            return new Book();
        }else if("cup".equals(type)){
            return new Cup();
        }
        return null;
    }


}
