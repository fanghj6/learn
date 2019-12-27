package com.structure.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fhj
 * @version 1.0
 * @ClassName JdkProxy
 * @Description TODO
 * @date 2019/12/23  16:20
 **/
public class JdkProxy implements InvocationHandler {

    /**
     * 获取代理对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        Object obj = method.invoke(target,args);
        postRequest();
        return obj;
    }

    private void preRequest(){
        System.out.println("代理购票");
    }
    private void postRequest(){
        System.out.println("代理购票成功");
    }

}
