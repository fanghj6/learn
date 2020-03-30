package com.version2.structure.combination.security;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/19  9:33
 **/
public class Client {

    public static void main(String[] args) {
        //组合模式
        //角色：抽象构件，叶子构件，容器构件
        //安全组合模式：不符合里氏替换原则
        File textFile = new TextFile();
        File imageFile = new ImageFile();
        Folder folder = new Folder();
        folder.add(textFile);

        Folder folder2 = new Folder();
        folder2.add(textFile);
        folder2.add(imageFile);

        folder.add(folder2);

        folder.antivirus();

    }
}
