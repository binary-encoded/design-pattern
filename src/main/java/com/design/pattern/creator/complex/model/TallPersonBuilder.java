package com.design.pattern.creator.complex.model;

/**
 * 类/接口描述
 *
 * @author 曾俊凯
 * @date 2022/4/28
 */
public class TallPersonBuilder implements BuilderHuman {
    Human human;
    public TallPersonBuilder() {
        human = new Human();
    }
    @Override
    public void head() {
        human.setHead("普通的头脑");
    }
    @Override
    public void body() {
        human.setBody("壮实，高大的身体");
    }
    @Override
    public void hand() {
        human.setHand("长手");
    }
    @Override
    public void foot() {
        human.setFoot("长脚");
    }
    @Override
    public Human build() {
        return human;
    }
}
