package com.design.pattern.creator.complex.model;

/**
 * 类/接口描述
 *
 * @author 曾俊凯
 * @date 2022/4/28
 */
public class SmartHumanBuilder implements BuilderHuman {
    Human human;
    public SmartHumanBuilder() {
        human = new Human();
    }
    @Override
    public void head() {
        human.setHead("高智商的头脑");
    }
    @Override
    public void body() {
        human.setBody("健康的身体");
    }
    @Override
    public void hand() {
        human.setHead("普通的手");
    }
    @Override
    public void foot() {
        human.setFoot("普通的脚");
    }
    @Override
    public Human build() {
        return human;
    }
}
