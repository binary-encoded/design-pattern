package com.design.pattern.factory.simple;

import com.design.pattern.factory.simple.model.Person;
import com.design.pattern.factory.simple.model.PersonFactory;

/**
 * 简单工厂模式
 * <p>
 * 简单工厂模式又称静态工厂模式，属于类创建型模式。
 * 在简单工厂模式中，可以根据参数的不同返回不同的示例。
 * 简单工厂专门定义一个类来负责创建其他类的示例，被创建的示例通常都具有共同的父类。
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person man = PersonFactory.create("man");
        man.eat("苹果🍎");
        Person women = PersonFactory.create("women");
        women.eat("香蕉🍌");
    }
}
