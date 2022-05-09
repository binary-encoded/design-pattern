package com.design.pattern.proxy.javassist.model;

/**
 * javassist调用处理器
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public interface InvocationHandler {
    Object invoke(String methodName, Object args[]);
}
