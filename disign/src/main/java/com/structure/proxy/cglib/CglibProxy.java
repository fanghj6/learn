package com.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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
public class CglibProxy implements MethodInterceptor {

    /**
     * 获取代理对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz,this);
    }

    private void preRequest(){
        System.out.println("代理购票");
    }
    private void postRequest(){
        System.out.println("代理购票成功");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        preRequest();
        Object obj = methodProxy.invokeSuper(o,objects);
        postRequest();
        return obj;
    }
}
