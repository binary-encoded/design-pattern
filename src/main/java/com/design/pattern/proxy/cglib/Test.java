package com.design.pattern.proxy.cglib;

import com.design.pattern.proxy.cglib.model.IPhone;
import com.design.pattern.proxy.cglib.model.Phone;
import com.design.pattern.proxy.cglib.model.ProxyClassFactory;

/**
 * 基于cglib实现的动态代理工厂
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Test {
    public static void main(String[] args) {
        ProxyClassFactory proxyClassFactory = new ProxyClassFactory();
        IPhone phone = (IPhone) proxyClassFactory.getInstance(new Phone());
        phone.call("153-0625-0000");
    }
}
