package com.design.pattern.proxy.javassist;

import com.design.pattern.proxy.javassist.model.IPhone;
import com.design.pattern.proxy.javassist.model.InvocationHandler;
import com.design.pattern.proxy.javassist.model.ProxyClassFactory;

/**
 * 类/接口描述
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class Test {
    public static void main(String[] args) throws Exception {
        InvocationHandler handler = (methodName, params) -> {
            switch (methodName) {
                case "call":
                    System.out.println(String.format("phone call for %s", params[0]));
                    break;
                case "photograph":
                    return "拍照成功";
            }
            return null;
        };
        IPhone phone = ProxyClassFactory.getInstance(IPhone.class, handler);
        phone.call("153-0625-0000");
        String photograph = phone.photograph();
        System.out.println("photograph = " + photograph);
    }
}
