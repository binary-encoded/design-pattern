package com.design.pattern.creator.simple;

import com.design.pattern.creator.simple.model.Robot;

/**
 * 创建者模式
 * <p>
 * 用于创建简单对象
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Test {
    public static void main(String[] args) {
        Robot robot = Robot.builder()
                .head("头")
                .body("身体")
                .foot("脚")
                .build();
        System.err.println("robot = " + robot.toString());
    }
}
