package com.design.pattern.visitor.model;

/**
 * 抽象访问者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public interface Visitor {
    /**
     * 访问工程师类型
     *
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     *
     * @param manager
     */
    void visit(Manager manager);
}
