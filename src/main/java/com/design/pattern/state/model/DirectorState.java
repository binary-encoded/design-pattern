package com.design.pattern.state.model;

/**
 * 总监审批状态
 * <p>
 * ConcreteState 具体状态
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class DirectorState extends AbstractState {
    @Override
    public void handle(CompanyContext context) {
        System.out.println("总监审批通过，我是最后一个审批者");
        System.out.println("财务打款500元");
    }
}
