package com.design.pattern.proxy.cglib.model;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于spring-cglib实现的动态代理工厂
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class ProxyClassFactory implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行……");
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println("执行结束");
        return result;
    }

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
