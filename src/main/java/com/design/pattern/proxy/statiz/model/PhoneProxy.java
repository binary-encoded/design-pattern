package com.design.pattern.proxy.statiz.model;

/**
 * 手机静态代理
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class PhoneProxy implements IPhone {
    private IPhone target;

    public PhoneProxy(IPhone target) {
        this.target = target;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("开始录音……");
        target.call(phoneNumber);
        System.out.println("录音结束");
    }
}
