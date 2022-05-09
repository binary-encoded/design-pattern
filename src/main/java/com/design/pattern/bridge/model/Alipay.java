package com.design.pattern.bridge.model;

import java.math.BigDecimal;

/**
 * 支付宝
 * 实现化角色（Implementor）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class Alipay extends Pay {
    public Alipay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public void pay(String secretKey, String tradeId, BigDecimal amount) {
        System.out.println("支付宝支付中……");
        Boolean result = payMode.securityPlay(secretKey);
        if (result) System.out.println(String.format("支付宝成功向[%s]支付%d", tradeId, amount.intValue()));
        else System.out.println("支付宝支付失败。");
    }
}
