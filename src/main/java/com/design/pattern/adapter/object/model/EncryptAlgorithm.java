package com.design.pattern.adapter.object.model;

/**
 * 加密算法接口
 * <p>
 * Target 目标角色
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public interface EncryptAlgorithm {
    /**
     * 加密算法
     *
     * @param content 需要加密的内容
     * @return 加密后的文本
     */
    String encrypt(String content);
}
