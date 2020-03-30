package com.version2.structure.adapter.defaultadapter;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/18  17:49
 **/
public class Client {

    public static void main(String[] args) {
        //适配器模式
        //角色：目标抽象类，适配器，适配者

        //对象适配器 ：适配器注入适配者对象
        //类适配器：适配器继承适配者对象
        //缺省适配器：适配接口的方法，增加适配器的抽象类（将不需要的方法空实现）
        //双向适配器：实现两边的适配

        /********************************/
        //缺省适配器
        Target target = new SumAdapter();
        String sum =target.request("6","6");
        System.out.println(sum);

    }
}
