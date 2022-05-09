package com.design.pattern.flyweight.model;

import java.util.Objects;

/**
 * 哈罗共享单车
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class HelloSharingBike extends SharingBike {
    public HelloSharingBike(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    public void lease(String userName) {
        if (Objects.equals(this.getState(), 1)) {
            System.err.println(String.format("共享单车[%s]已被租借", this.getBikeId()));
            return;
        }
        this.setState(1);
        this.setUserName(userName);
        System.out.println(String.format("哈罗共享单车[%s]已被[%s]租借", this.getBikeId(), this.getUserName()));
    }

    @Override
    public void back() {
        this.setState(0);
        this.setUserName("");
    }
}
