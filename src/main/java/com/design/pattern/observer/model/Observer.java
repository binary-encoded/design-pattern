package com.design.pattern.observer.model;

/**
 * 观察者接口
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public interface Observer {
    void update(Observable observable, Object arg);
}
