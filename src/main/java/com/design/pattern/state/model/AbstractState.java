package com.design.pattern.state.model;

/**
 * 抽象状态，默认方法
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public abstract class AbstractState implements AskLeaveState {
    @Override
    public abstract void handle(CompanyContext context);
}
