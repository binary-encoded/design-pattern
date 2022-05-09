package com.design.pattern.command.model;

/**
 * 电灯
 * <p>
 * Receiver 接受者，接受命令的对象
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Light {
    private Boolean isOpen = false;

    public void open() {
        isOpen = true;
        System.out.println("open the light.");
    }

    public void off() {
        isOpen = false;
        System.out.println("off the light.");
    }
}
