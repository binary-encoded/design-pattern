package com.design.pattern.observer.model;

/**
 * 空方类
 * <p>
 * 价格上涨会伤心，价格下跌会高兴
 * <p>
 * 具体观察者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Bera implements Observer {
    @Override
    public void update(Observable observable, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.err.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
