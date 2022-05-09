package com.design.pattern.bridge.model;

import java.util.Objects;

/**
 * 人脸支付模式
 * 具体实现化角色（Concrete Implementor）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class PayFaceMode implements IPayMode {
    @Override
    public Boolean securityPlay(String secretKey) {
        Boolean result = Objects.equals(secretKey, "123456");
        if (result) return true;
        System.out.println("人脸支付失败……");
        return false;
    }
}
