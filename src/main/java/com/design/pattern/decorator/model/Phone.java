package com.design.pattern.decorator.model;

/**
 * 手机接口
 * 抽象构件（Component）
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public interface Phone {
    void photograph();

    void call(String phoneNumber);
}
