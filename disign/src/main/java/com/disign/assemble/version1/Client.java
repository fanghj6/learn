package com.disign.assemble.version1;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/3  22:18
 **/
public class Client {

    /**
     * 安全模式
     * @param args
     */
    public static void main(String[] args) {
        Folder folder = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");

        Leaf leaf = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");
        Leaf leaf4 = new Leaf("leaf4");
        Leaf leaf5 = new Leaf("leaf5");
        folder.addChild(leaf);
        folder.addChild(folder2);
        folder2.addChild(leaf2);
        folder2.addChild(leaf3);
        folder2.addChild(folder3);
        folder3.addChild(leaf4);
        folder3.addChild(leaf5);
        folder3.remove(leaf4);
        leaf2.scan();
        System.out.println(folder3.getChild(0).getName());

        folder.scan();

    }
}
