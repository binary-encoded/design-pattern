package com.design.pattern.observer.model;


/**
 * 石油期货类
 * <p>
 * 具体目标
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class OilFutures extends Observable {
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        super.notifyObservers(price);
        this.price = price;
    }
}
