package com.design.pattern.adapter.clazz.model;

/**
 * md5算法适配器
 * <p>
 * Adapter 适配器角色
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class MD5EncryptAdaptor extends MD5Algorithm implements EncryptAlgorithm {
    @Override
    public String encrypt(String content) {
        return super.encrypt(content);
    }
}
