package com.design.pattern.template.model;

/**
 * 花生豆浆
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class PeanutSoybeanMilk extends SoybeanMilk {
    @Override
    public void selectSoybean() {
        System.out.println("选择花生和黄豆……");
    }

    @Override
    public void addCondiments() {
        System.out.println("添加白砂糖、花生碎……");
    }
}
