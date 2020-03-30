package com.version2.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/20  17:46
 **/
public class Client {

    public static void main(String[] args) {
        //代理模式：
        //角色：抽象主题角色，代理主题角色，具体主题角色
        //类型：保护，远程，虚拟，缓存，智能引用代理

        //保护+智能引用
        Subject subject = new ProxySubject();
        System.out.println(subject.request("admin","admin"));

    }
}
