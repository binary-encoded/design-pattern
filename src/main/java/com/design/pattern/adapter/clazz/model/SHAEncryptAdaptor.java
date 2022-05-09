package com.design.pattern.adapter.clazz.model;

/**
 * sha算法适配器
 * <p>
 * Adapter 适配器角色
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class SHAEncryptAdaptor extends SHAAlgorithm implements EncryptAlgorithm {
    @Override
    public String encrypt(String content) {
        return super.encrypt(content);
    }
}
