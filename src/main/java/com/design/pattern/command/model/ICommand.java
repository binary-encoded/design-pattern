package com.design.pattern.command.model;

/**
 * 命令接口
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public abstract class ICommand {
    public abstract void execute();

    public abstract void undo();
}
