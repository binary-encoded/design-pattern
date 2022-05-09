package com.design.pattern.proxy.cglib.model;

/**
 * 手机接口实现
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Phone implements IPhone {
    @Override
    public void call(String phoneNumber) {
        System.out.println(String.format("phone call for %s", phoneNumber));
    }
}
