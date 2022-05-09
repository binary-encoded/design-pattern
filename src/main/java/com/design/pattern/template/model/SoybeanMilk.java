package com.design.pattern.template.model;

/**
 * 豆浆制作模版
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public abstract class SoybeanMilk {
    /**
     * 豆浆制作函数
     * 使用 final 修饰，防止子类重写该方法
     */
    public final void make() {
        selectSoybean();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    public abstract void selectSoybean();

    /**
     * 添加配料
     */
    public abstract void addCondiments();

    /**
     * 浸泡
     */
    public void soak() {
        System.out.println("材料开始浸泡……");
    }

    /**
     * 打碎
     */
    public void beat() {
        System.out.println("放入豆浆机搅拌……");
    }
}
