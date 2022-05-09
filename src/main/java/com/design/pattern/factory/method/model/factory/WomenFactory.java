package com.design.pattern.factory.method.model.factory;

import com.design.pattern.factory.method.model.Person;
import com.design.pattern.factory.method.model.Women;

/**
 * 女人工厂
 * <p>
 * 具体工厂类
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class WomenFactory implements PersonFactory {
    @Override
    public Person builder() {
        System.out.println("正在创造女人...");
        return new Women();
    }
}
