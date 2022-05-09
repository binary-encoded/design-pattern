package com.design.pattern.singleton.model;

/**
 * 饿汉模式
 * <p>
 * 在程序启动或单例模式类被加载的时候，单例模式实例就已经被创建。
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
public class HungryManMode {
    private HungryManMode() {
    }

    private static HungryManMode instance = new HungryManMode();

    public static HungryManMode getInstance() {
        return instance;
    }
}
