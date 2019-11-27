package com.disign.exterior.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Clietn 外观模式
 * @Description TODO
 * @date 2019/9/6  0:00
 **/
public class Client {

    public static void main(String[] args) {
        AbstractFileOperating fileOperating = new FileOperating();
        fileOperating.FileOperating("/opt/test.txt","/opt/upload/test.txt");
    }
}
