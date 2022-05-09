package com.design.pattern.visitor.model;

/**
 * CEO访问者
 * <p>
 * ConcreteVisitor 具体访问者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }
}
