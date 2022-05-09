package com.design.pattern.visitor.model;

/**
 * CTO访问者
 * <p>
 * ConcreteVisitor 具体访问者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}
