package com.design.pattern.command.model;

/**
 * 电灯开命令
 * ConcreteCommand 具体命令
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class LightOpenCommand extends ICommand {
    private Light light;

    public LightOpenCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.open();
    }

    @Override
    public void undo() {
        light.off();
    }
}
