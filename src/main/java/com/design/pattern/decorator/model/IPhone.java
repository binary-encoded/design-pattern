package com.design.pattern.decorator.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Apple手机
 * 具体构件（ConcreteComponent）
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class IPhone implements Phone {
    @Override
    public void photograph() {
        System.out.println("拍照成功，照片已保存");
    }

    @Override
    public void call(String phoneNumber) {
        if (StringUtils.isEmpty(phoneNumber)) {
            throw new IllegalArgumentException("你所呼叫的号码为NULL");
        }
        System.out.println(String.format("call for %s", phoneNumber));
    }
}
