package com.structure.combination;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 组合模式：角色  抽象构件，叶子构件，容器构件
 * 透明组合模式：完全针对抽象编程
 * 安全组合模式： 子类中存在抽象类没有的方法，针对子类编程
 * 软件实体中存在层次结构，客户端无需关心层次结构
 * @date 2019/12/23  9:59
 **/
public class Client {

    public static void main(String[] args) {
        //安全组合模式
        Leaf image = new Leaf("image文件");
        Leaf text = new Leaf("text文件");

        Folder folder = new Folder("文件夹");
        Folder imageFolder = new Folder("image文件夹");
        Folder textFolder = new Folder("image文件夹");

        imageFolder.add(image);
        textFolder.add(text);
        folder.add(imageFolder);
        folder.add(textFolder);

        folder.antivirus();
    }
}
