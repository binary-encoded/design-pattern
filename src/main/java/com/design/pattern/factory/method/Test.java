package com.design.pattern.factory.method;

import com.design.pattern.factory.method.model.Person;
import com.design.pattern.factory.method.model.factory.ManFactory;
import com.design.pattern.factory.method.model.factory.WomenFactory;

/**
 * 工厂方法模式
 * <p>
 * 工厂方法模式又称为虚拟构造器模式或多态工厂模式，属于类创建型模式。
 * 在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂
 * 子类则负责生产具体的产品对象，这样做的目的是将产品类的实例化操作
 * 延迟到工厂子类中完成，即通过工厂子类来确定究竟应该实例化哪一个具体
 * 产品类。
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public class Test {
    public static void main(String[] args) {
        ManFactory manFactory = new ManFactory();
        Person man = manFactory.builder();
        man.eat("苹果🍎");

        WomenFactory womenFactory = new WomenFactory();
        Person women = womenFactory.builder();
        women.eat("香蕉🍌");
    }
}
