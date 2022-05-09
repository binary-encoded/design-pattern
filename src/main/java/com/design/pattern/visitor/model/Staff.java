package com.design.pattern.visitor.model;

import java.util.Random;

/**
 * 员工基类
 * <p>
 * target  抽象目标，可以是抽象类或接口
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public abstract class Staff {
    public String name;
    public Integer kpi;// 员工KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 核心方法，接受Visitor的访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
