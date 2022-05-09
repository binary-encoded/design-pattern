package com.design.pattern.singleton;

import com.design.pattern.singleton.model.HungryManMode;
import com.design.pattern.singleton.model.SlackerMode;
import com.design.pattern.singleton.model.StaticInnerMode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 单例模式
 * <p>
 * 单例模式是Java中最简单的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1000);

        // 饿汉模式
        List<Callable<HungryManMode>> HungryManModeTasks = new ArrayList<Callable<HungryManMode>>() {{
            add(() -> HungryManMode.getInstance());
            add(() -> HungryManMode.getInstance());
            add(() -> HungryManMode.getInstance());
            add(() -> HungryManMode.getInstance());
        }};
        List<Future<HungryManMode>> HungryManModeFutures = executorService.invokeAll(HungryManModeTasks);
        for (Future<HungryManMode> future : HungryManModeFutures) {
            System.err.println("HungryManMode instance = " + future.get());
        }

        // 懒汉模式
        List<Callable<SlackerMode>> SlackerModeTasks = new ArrayList<Callable<SlackerMode>>() {{
            add(() -> SlackerMode.getInstance());
            add(() -> SlackerMode.getInstance());
            add(() -> SlackerMode.getInstance());
            add(() -> SlackerMode.getInstance());
        }};
        List<Future<SlackerMode>> SlackerModeFutures = executorService.invokeAll(SlackerModeTasks);
        for (Future<SlackerMode> future : SlackerModeFutures) {
            System.err.println("SlackerMode instance = " + future.get());
        }

        // 静态内部类
        List<Callable<StaticInnerMode>> StaticInnerModeTasks = new ArrayList<Callable<StaticInnerMode>>() {{
            add(() -> StaticInnerMode.getInstance());
            add(() -> StaticInnerMode.getInstance());
            add(() -> StaticInnerMode.getInstance());
            add(() -> StaticInnerMode.getInstance());
        }};
        List<Future<StaticInnerMode>> StaticInnerModeFutures = executorService.invokeAll(StaticInnerModeTasks);
        for (Future<StaticInnerMode> future : StaticInnerModeFutures) {
            System.err.println("StaticInnerMode instance = " + future.get());
        }
    }
}
