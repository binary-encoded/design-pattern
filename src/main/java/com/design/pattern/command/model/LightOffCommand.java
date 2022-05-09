package com.design.pattern.command.model;

/**
 * 电灯关命令
 * ConcreteCommand 具体命令
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class LightOffCommand extends ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.open();
    }
}
