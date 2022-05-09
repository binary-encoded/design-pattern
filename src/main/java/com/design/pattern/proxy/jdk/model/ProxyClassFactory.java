package com.design.pattern.proxy.jdk.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于jdk实现的动态代理工厂
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class ProxyClassFactory implements InvocationHandler {
    private Object target;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");
        Object invoke = method.invoke(target, args);
        System.out.println("开始执行");
        return invoke;
    }

    /**
     * 产生代理类
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
