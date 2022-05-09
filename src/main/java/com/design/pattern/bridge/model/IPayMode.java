package com.design.pattern.bridge.model;

/**
 * 支付模式接口
 * 扩展抽象化角色（Refined Abstraction）
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public interface IPayMode {
    Boolean securityPlay(String secretKey);
}
