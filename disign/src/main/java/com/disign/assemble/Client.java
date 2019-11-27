package com.disign.assemble;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/3  22:18
 **/
public class Client {

    /**
     * 透明模式
     * @param args
     */
    public static void main(String[] args) {
        File folder = new Folder("folder1");
        File folder2 = new Folder("folder2");
        File folder3 = new Folder("folder3");

        File leaf = new Leaf("leaf1");
        File leaf2 = new Leaf("leaf2");
        File leaf3 = new Leaf("leaf3");
        File leaf4 = new Leaf("leaf4");
        File leaf5 = new Leaf("leaf5");
        folder.addChild(leaf);
        folder.addChild(folder2);
        folder2.addChild(leaf2);
        folder2.addChild(leaf3);
        folder2.addChild(folder3);
        folder3.addChild(leaf4);
        folder3.addChild(leaf5);
        folder3.remove(leaf4);
        System.out.println(folder3.getChild(0).getName());

        folder.scan();

    }
}
