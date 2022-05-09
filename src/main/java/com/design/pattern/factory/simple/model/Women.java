package com.design.pattern.factory.simple.model;

/**
 * 女人类
 * <p>
 * 具体产品类
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class Women implements Person {
    public Women() {
        System.out.println("成功创建了女人...");
    }

    @Override
    public void eat(String food) {
        System.out.println(String.format("女人正在吃%s", food));
    }
}
