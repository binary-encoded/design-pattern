package com.design.pattern.flyweight;

import com.design.pattern.flyweight.model.SharingBike;
import com.design.pattern.flyweight.model.SharingBikeFactory;

import java.util.concurrent.ExecutionException;

/**
 * 享元模式
 * <p>
 * 运用共享技术有效地支持大量细度的对象。
 * <p>
 * 享元模式是为了减少内存开销而存在的，所以编程过程中，
 * 如果遇到需要大量对象或者需要大量内存空间的时候，就
 * 可以考虑能不能额使用享元模式。
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SharingBikeFactory sharingBikeFactory = SharingBikeFactory.getInstance();

        SharingBike sharingBike1 = sharingBikeFactory.getBike();
        SharingBike sharingBike2 = sharingBikeFactory.getBike();
        sharingBike1.lease("曾俊凯");
        sharingBike2.lease("小白");

        System.out.println(sharingBike1 == sharingBike2);
        System.err.println("sharingBike2 = " + sharingBike2.toJSONString());
        System.err.println("sharingBike1 = " + sharingBike1.toJSONString());
    }
}
