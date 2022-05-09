package com.design.pattern.adapter.object.model;

/**
 * 算法客户端
 * <p>
 * Client 客户端
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class EncryptClient {
    public String encrypt(EncryptAlgorithm encryptAlgorithm, String content) {
        return EncryptAdaptor.encrypt(encryptAlgorithm, content);
    }
}
