package com.design.pattern.template.model;

/**
 * 黑豆豆浆
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class BlackBeanMilk extends SoybeanMilk {
    @Override
    public void selectSoybean() {
        System.out.println("选择黑豆……");
    }

    @Override
    public void addCondiments() {
        System.out.println("添加白砂糖……");
    }
}
