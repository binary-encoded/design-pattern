package com.design.pattern.singleton.model;

/**
 * 懒汉模式
 * <p>
 * 当程序第一次访问单例模式实例时才进行创建。
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
public class SlackerMode {
    private static volatile SlackerMode instance;
    private static volatile Integer count = 0;

    public static SlackerMode getInstance() {
        if (instance == null) {
            synchronized (SlackerMode.class) {
                if (instance == null) {
                    instance = new SlackerMode();
                }
            }
        }
        return instance;
    }
}
