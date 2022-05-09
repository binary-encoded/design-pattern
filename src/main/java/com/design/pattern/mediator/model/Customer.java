package com.design.pattern.mediator.model;

/**
 * 抽象客户类
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public abstract class Customer {
    protected String name;
    protected Mediator mediator;

    public Customer(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void contact(String message);

    public abstract void getMessage(String message, Customer customer);
}
