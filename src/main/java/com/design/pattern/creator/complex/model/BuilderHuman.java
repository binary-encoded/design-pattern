package com.design.pattern.creator.complex.model;

/**
 * 类/接口描述
 *
 * @author 曾俊凯
 * @date 2022/4/28
 */
public interface BuilderHuman {
    void head();

    void body();

    void hand();

    void foot();

    Human build();
}
