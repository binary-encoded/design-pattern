package com.design.pattern.state.model;

/**
 * 主管审批状态
 * <p>
 * ConcreteState 具体状态
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class SupervisorState extends AbstractState {
    @Override
    public void handle(CompanyContext context) {
        System.out.println("主管审批通过，下一个经理审批");
        context.setState(CompanyContext.Manager_State);
    }
}
