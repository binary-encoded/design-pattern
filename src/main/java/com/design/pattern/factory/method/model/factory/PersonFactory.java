package com.design.pattern.factory.method.model.factory;

import com.design.pattern.factory.method.model.Person;

/**
 * 人类工厂
 * <p>
 * 抽象工厂
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public interface PersonFactory {
    Person builder();
}
