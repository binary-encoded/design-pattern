package com.design.pattern.factory.simple.model;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * 女娲类
 * <p>
 * 工具角色
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class PersonFactory {
    public static Person create(String personType) throws Exception {
        if (StringUtils.isEmpty(personType)) {
            new Exception("对不起，类型不能为空。");
        }
        Person person;
        switch (personType.toLowerCase(Locale.ROOT)) {
            case "man":
                person = new Man();
                break;
            case "women":
                person = new Women();
                break;
            default:
                throw new Exception("对不起，暂时无法创造该人。");
        }
        return person;
    }
}
