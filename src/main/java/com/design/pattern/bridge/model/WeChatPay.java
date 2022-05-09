package com.design.pattern.bridge.model;

import java.math.BigDecimal;

/**
 * 微信支付
 * 实现化角色（Implementor）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class WeChatPay extends Pay {
    public WeChatPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public void pay(String secretKey, String tradeId, BigDecimal amount) {
        System.out.println("微信支付中……");
        Boolean result = payMode.securityPlay(secretKey);
        if (result) System.out.println(String.format("微信成功向[%s]支付%d", tradeId, amount.intValue()));
        else System.out.println("微信支付失败。");
    }
}
