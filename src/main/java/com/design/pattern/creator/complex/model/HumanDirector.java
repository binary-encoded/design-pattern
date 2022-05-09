package com.design.pattern.creator.complex.model;

/**
 * 人类（指挥者）
 *
 * @author 曾俊凯
 * @date 2022/4/28
 */
public class HumanDirector {
    public Human createHumanByDirector(BuilderHuman builderHuman) {
        builderHuman.head();
        builderHuman.body();
        builderHuman.hand();
        builderHuman.foot();
        return builderHuman.build();
    }
}
