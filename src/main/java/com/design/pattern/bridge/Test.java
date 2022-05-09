package com.design.pattern.bridge;

import com.design.pattern.bridge.model.*;

import java.math.BigDecimal;

/**
 * 桥接模式
 * <p>
 * 桥接模式是用于把抽象化与实现化解耦，使得二者可以独立变化，它通过提供抽象化和实例化之间的桥接结构，来实现二者的解耦。
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class Test {
    public static void main(String[] args) {
        // 微信使用指纹支付
        Pay weChatPay = new WeChatPay(new PayFingerprintMode());
        weChatPay.pay("1234506", "15306250000", BigDecimal.valueOf(200));
        // 支付宝使用人脸支付
        Pay alipay = new Alipay(new PayFaceMode());
        alipay.pay("123456", "15306250000", BigDecimal.valueOf(200));
    }
}
