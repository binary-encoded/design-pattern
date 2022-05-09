package com.design.pattern.adapter.object.model;

/**
 * 算法适配器类
 * <p>
 * Adapter 适配器类
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class EncryptAdaptor {
    private EncryptAlgorithm encryptAlgorithm;

    public EncryptAdaptor(EncryptAlgorithm encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
    }

    public EncryptAdaptor() {
    }

    public static String encrypt(EncryptAlgorithm encryptAlgorithm, String content) {
        return encryptAlgorithm.encrypt(content);
    }

    public String encrypt(String content) {
        return encryptAlgorithm.encrypt(content);
    }
}
