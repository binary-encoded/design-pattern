package com.design.pattern.observer;

import com.design.pattern.observer.model.Bera;
import com.design.pattern.observer.model.Bull;
import com.design.pattern.observer.model.OilFutures;

import java.math.BigDecimal;

/**
 * 观察者模式
 * <p>
 * 又叫发布订阅模式，简单来说就是一对多的依赖，并且把观察者和被观察者对象分开松耦合。
 * 当某个对象的状态发生更新是，所有依赖的观察者都会收到更新，而断掉依赖的则不再收到。
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Test {
    public static void main(String[] args) {
        OilFutures oilFutures = new OilFutures() {{
            addObserver(new Bull());
            addObserver(new Bera());
        }};
        oilFutures.setPrice(10f);
        oilFutures.setPrice(Float.valueOf(new BigDecimal(oilFutures.getPrice()).negate().floatValue()));
    }
}
