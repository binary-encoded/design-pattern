package com.design.pattern.proxy.statiz;

import com.design.pattern.proxy.statiz.model.Phone;
import com.design.pattern.proxy.statiz.model.PhoneProxy;

/**
 * 静态代理
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Test {
    public static void main(String[] args) {
        PhoneProxy phoneProxy = new PhoneProxy(new Phone());
        phoneProxy.call("153-0625-0000");
    }
}
