package com.design.pattern.mediator.model;

/**
 * Mediator 抽象中介者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public abstract class Mediator {
    protected abstract void contact(String message, Customer customer);
}
