package com.design.pattern.bridge.model;

import java.util.Objects;

/**
 * 密码支付模式
 * 具体实现化角色（Concrete Implementor）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class PayCypherMode implements IPayMode {
    @Override
    public Boolean securityPlay(String secretKey) {
        Boolean result = Objects.equals(secretKey, "123456");
        if (result) return true;
        System.out.println("支付密码错误……");
        return false;
    }
}
