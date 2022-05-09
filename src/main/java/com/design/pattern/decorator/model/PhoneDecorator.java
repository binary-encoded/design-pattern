package com.design.pattern.decorator.model;

/**
 * 手机装饰器
 * 抽象装饰器（Decorator）
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public abstract class PhoneDecorator implements Phone {
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void photograph() {
        phone.photograph();
    }

    @Override
    public void call(String phoneNumber) {
        phone.call(phoneNumber);
    }
}
