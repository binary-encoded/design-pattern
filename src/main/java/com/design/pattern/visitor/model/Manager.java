package com.design.pattern.visitor.model;

import java.util.Random;

/**
 * 经理类
 * <p>
 * ConcreteTarget 具体目标对象
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Manager extends Staff {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 一年做的产品数量
     *
     * @return
     */
    public Integer getProducts() {
        return new Random().nextInt(10);
    }
}
