package com.design.pattern.state.model;

/**
 * 抽象请假状态
 * <p>
 * State 抽象状态类
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public interface AskLeaveState {
    void handle(CompanyContext context);
}
