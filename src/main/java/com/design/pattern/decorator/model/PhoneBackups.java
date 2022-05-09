package com.design.pattern.decorator.model;

/**
 * 增加手机信息备份
 * 具体装饰器（ConcreteDecorator）
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class PhoneBackups extends PhoneDecorator {
    public PhoneBackups(Phone phone) {
        super(phone);
    }

    @Override
    public void photograph() {
        super.photograph();
        System.out.println("添加图片备份");
    }

    @Override
    public void call(String phoneNumber) {
        super.call(phoneNumber);
        System.out.println("添加呼叫备份");
    }
}
