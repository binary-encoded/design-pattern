package com.design.pattern.factory.method.model.factory;

import com.design.pattern.factory.method.model.Man;
import com.design.pattern.factory.method.model.Person;

/**
 * 男人工厂
 * <p>
 * 具体工厂类
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class ManFactory implements PersonFactory {
    @Override
    public Person builder() {
        System.out.println("正在创造男人...");
        return new Man();
    }
}
