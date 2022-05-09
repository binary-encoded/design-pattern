package com.design.pattern.visitor.model;

import java.util.Random;

/**
 * 工程师类
 * <p>
 * ConcreteTarget 具体目标对象
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 工程师一年的代码数量
     *
     * @return
     */
    public Integer getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
