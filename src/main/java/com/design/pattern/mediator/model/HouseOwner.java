package com.design.pattern.mediator.model;

/**
 * 房主类
 * <p>
 * 具体客户类
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class HouseOwner extends Customer {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        this.mediator.contact(message, this);
    }

    @Override
    public void getMessage(String message, Customer customer) {
        String msg = String.format("房主[%s]收到房客[%s]信息：%s", super.name, customer.getName(), message);
        System.err.println(msg);
    }
}
