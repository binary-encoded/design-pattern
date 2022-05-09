package com.design.pattern.singleton.model;

import java.io.Serializable;

/**
 * 静态内部类
 * <p>
 * 静态内部类单例模式中实例由内部类创建，由于JVM在加载外部类的过程中，是不会加载静态内部类的，
 * 只有内部类的属性/方法被调用时才会被加载，并初始化其静态属性，静态属性由于被`static`修饰，
 * 保证只被实例化一次，并且严格保证实例化顺序。
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
public class StaticInnerMode implements Serializable {
    private static final long serialVersionUID = 1L;

    private StaticInnerMode() {
        //防止反射破坏代理模式
        if (getInstance() != null) {
            throw new RuntimeException();
        }
    }

    private static class SingletonHolder {
        private static final StaticInnerMode INSTANCE = new StaticInnerMode();
    }

    public static StaticInnerMode getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 防止序列化破坏单例模式
     *
     * @return
     */
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
