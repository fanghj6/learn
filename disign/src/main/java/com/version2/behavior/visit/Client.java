package com.version2.behavior.visit;

import org.springframework.ui.Model;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/26  11:20
 **/
public class Client {

    public static void main(String[] args) {
        //访问者模式
        //角色：抽象访问者，具体访问者，抽象元素，具体元素，对象结构
        Employee lisi = new NormalEmployee("lisi","200");
        Employee wanwu = new NormalEmployee("wanwu","300");
        Employee zhaoliu = new NormalEmployee("zhaoliu","260");
        Employee wanba = new TemporaryEmployee("wanba","300");
        Employee jenkins = new TemporaryEmployee("wanba","300");

        Structure structure = new Structure();
        structure.addEmp(lisi);
        structure.addEmp(wanwu);
        structure.addEmp(zhaoliu);
        structure.addEmp(wanba);
        structure.addEmp(jenkins);

        Visitor visitor = new BigDataVisitor();

        structure.calculation(visitor);

    }
}
