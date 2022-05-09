package com.design.pattern.adapter.object.model;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;

/**
 * md5加密算法
 * <p>
 * Adaptee 原角色，需要适配的角色
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class MD5Algorithm implements EncryptAlgorithm {
    @Override
    public String encrypt(String content) {
        System.out.println("md5 content = " + content);
        String md5 = "";
        if (StringUtils.isEmpty(content)) return md5;
        try {
            md5 = DigestUtils.md5DigestAsHex(content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return md5;
    }
}
