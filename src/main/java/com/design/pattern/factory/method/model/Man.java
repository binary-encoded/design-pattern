package com.design.pattern.factory.method.model;

/**
 * 男人
 * <p>
 * 具体产品
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class Man implements Person {
    public Man() {
        System.out.println("成功创造了男人...");
    }

    @Override
    public void eat(String food) {
        System.out.println(String.format("男人正在吃%s", food));
    }
}
