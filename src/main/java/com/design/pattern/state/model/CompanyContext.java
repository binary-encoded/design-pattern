package com.design.pattern.state.model;

/**
 * 公司类
 * <p>
 * Context 状态上下文
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class CompanyContext {
    private AskLeaveState state;
    public static final AskLeaveState Supervisor_State = new SupervisorState();
    public static final AskLeaveState Manager_State = new ManagerState();
    public static final AskLeaveState Director_State = new DirectorState();

    public CompanyContext() {
        state = Supervisor_State;
    }

    public void setState(AskLeaveState state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
