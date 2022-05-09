package com.design.pattern.decorator;

import com.design.pattern.decorator.model.IPhone;
import com.design.pattern.decorator.model.Phone;
import com.design.pattern.decorator.model.Phone5G;
import com.design.pattern.decorator.model.PhoneBackups;

/**
 * 装饰器模式
 * <p>
 * 装饰器模式又叫包装(Wrapper)模式，装饰器模式动态地将附加职责添加到对象。
 * 装饰器为子类提供了灵活替代方案，以扩展功能。
 * <p>
 * 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责(即增加其额外功能)
 * 的模式，它属于对象结构型模式。
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Phone iPhone = new PhoneBackups(new Phone5G(new IPhone()));
        Phone iPhone = new Phone5G(new PhoneBackups(new IPhone()));
        iPhone.photograph();
        Thread.sleep(100);
        System.err.println("------------");
        iPhone.call("153-0625-XXXX");
    }
}
