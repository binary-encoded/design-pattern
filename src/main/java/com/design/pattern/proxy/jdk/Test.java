package com.design.pattern.proxy.jdk;

import com.design.pattern.proxy.jdk.model.IPhone;
import com.design.pattern.proxy.jdk.model.Phone;
import com.design.pattern.proxy.jdk.model.ProxyClassFactory;

/**
 * 基于jdk实现的动态代理
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
