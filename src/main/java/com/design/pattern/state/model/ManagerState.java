package com.design.pattern.state.model;

/**
 * 经理审批状态
 * <p>
 * ConcreteState 具体状态
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class ManagerState extends AbstractState {
    @Override
    public void handle(CompanyContext context) {
        System.out.println("经理审批通过，下一个总监审批");
        context.setState(CompanyContext.Director_State);
    }
}
