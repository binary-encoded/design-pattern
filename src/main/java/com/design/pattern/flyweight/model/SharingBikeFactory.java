package com.design.pattern.flyweight.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 共享单车工厂
 * FlyweightFactory 享元工厂
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class SharingBikeFactory {
    private volatile List<SharingBike> sharingBikes;
    private static volatile SharingBikeFactory instance;

    public static SharingBikeFactory getInstance() {
        if (instance == null) {
            synchronized (SharingBikeFactory.class) {
                if (instance == null) {
                    instance = new SharingBikeFactory();
                }
            }
        }
        return instance;
    }

    /**
     * 初始化
     */
    static {
        getInstance().sharingBikes = new ArrayList<SharingBike>() {{
            add(new HelloSharingBike("HELLO-001"));
            add(new HelloSharingBike("HELLO-002"));
            add(new HelloSharingBike("HELLO-003"));
            add(new HelloSharingBike("HELLO-004"));
            add(new HelloSharingBike("HELLO-005"));
            add(new MeituanSharingBike("MEITUAN-001"));
            add(new MeituanSharingBike("MEITUAN-002"));
            add(new MeituanSharingBike("MEITUAN-003"));
            add(new MeituanSharingBike("MEITUAN-004"));
            add(new MeituanSharingBike("MEITUAN-005"));
        }};
        Collections.shuffle(getInstance().sharingBikes);
    }

    public List<SharingBike> getSharingBikes() {
        return sharingBikes;
    }

    /**
     * 获取可租借的共享单车
     *
     * @return
     */
    public synchronized SharingBike getBike() {
        return sharingBikes.stream()
                .filter(bike -> Objects.equals(bike.getState(), 0))
                .findFirst()
                .get();
    }
}
