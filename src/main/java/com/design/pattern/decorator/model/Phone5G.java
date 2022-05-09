package com.design.pattern.decorator.model;

/**
 * 5G手机
 * 具体装饰器（ConcreteDecorator）
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Phone5G extends PhoneDecorator {
    public Phone5G(Phone phone) {
        super(phone);
    }

    @Override
    public void photograph() {
        super.photograph();
        System.out.println("照片已上传云端☁️");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("使用5G网络️");
        super.call(phoneNumber);
    }
}
