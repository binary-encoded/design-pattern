package com.design.pattern.command.model;

/**
 * 电灯开关
 * <p>
 * Invoker 调用者
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class LightSwitch {
    private LightOpenCommand openCommand;
    private LightOffCommand offCommand;

    public LightSwitch() {
    }

    public LightSwitch(LightOpenCommand openCommand, LightOffCommand offCommand) {
        this.openCommand = openCommand;
        this.offCommand = offCommand;
    }

    public void setOpenCommand(LightOpenCommand openCommand) {
        this.openCommand = openCommand;
    }

    public void setOffCommand(LightOffCommand offCommand) {
        this.offCommand = offCommand;
    }

    public void openLight() {
        openCommand.execute();
    }

    public void offLight() {
        offCommand.execute();
    }
}
