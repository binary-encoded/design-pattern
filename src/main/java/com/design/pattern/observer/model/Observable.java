package com.design.pattern.observer.model;

import org.springframework.util.CollectionUtils;

import java.util.Vector;

/**
 * 抽象目标类
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public abstract class Observable {

    private Vector<Observer> observers = new Vector<>();

    protected final Boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    protected final void notifyObservers(Object arg) {
        if (CollectionUtils.isEmpty(observers)) return;
        this.observers.forEach(observer -> observer.update(this, arg));
    }

}
