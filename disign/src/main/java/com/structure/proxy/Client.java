package com.structure.proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  代理模式,角色：抽象主题，代理主题，具体主题
 * 保护代理：在代理类控制访问权限。。。
 * 远程代理：代理远程服务之间相互调用
 * 虚拟代理：对象加载时间长，用一个虚拟对象代替
 * 缓存代理：查询数据太慢使用缓存，每次从缓存获取
 * 智能引用：在代理类为具体实现增加额外的职责
 * @date 2019/12/23  16:04
 **/
public class Client {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }
}
