package com.design.pattern.bridge.model;

import java.math.BigDecimal;

/**
 * 支付类
 * 抽象化角色（Abstraction）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public abstract class Pay {
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract void pay(String secretKey, String tradeId, BigDecimal amount);
}
