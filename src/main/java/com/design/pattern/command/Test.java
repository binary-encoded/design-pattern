package com.design.pattern.command;

import com.design.pattern.command.model.Light;
import com.design.pattern.command.model.LightOffCommand;
import com.design.pattern.command.model.LightOpenCommand;
import com.design.pattern.command.model.LightSwitch;

/**
 * 命令模式
 * <p>
 * 命令模式属于行为型设计模式。
 * 将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化，对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 命令模式又称为动作(Action)模式或事物(Transaction)模式。
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        LightSwitch lightSwitch = new LightSwitch(new LightOpenCommand(light), new LightOffCommand(light));
        lightSwitch.openLight();
        lightSwitch.offLight();
    }
}
