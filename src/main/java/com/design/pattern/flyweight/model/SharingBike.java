package com.design.pattern.flyweight.model;

import com.alibaba.fastjson.JSON;

/**
 * 共享单车
 * Flyweight  抽象享元对象
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public abstract class SharingBike {
    protected Integer state = 0; // 0-未使用，1-已使用
    protected String userName;
    protected String bikeId;

    public String getUserName() {
        return userName;
    }

    protected void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getState() {
        return state;
    }

    protected void setState(Integer state) {
        this.state = state;
    }

    public String getBikeId() {
        return bikeId;
    }

    public abstract void lease(String userName);

    public abstract void back();

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
