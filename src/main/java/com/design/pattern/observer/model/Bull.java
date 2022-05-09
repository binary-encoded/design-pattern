package com.design.pattern.observer.model;

/**
 * 多方类
 * <p>
 * 价格上涨会高兴，价格下跌会伤心
 * <p>
 * 具体观察者
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Bull implements Observer {
    @Override
    public void update(Observable observable, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.err.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
