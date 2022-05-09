package com.design.pattern.factory.abstrac.model;

/**
 * 数据库工具类
 * <p>
 * 抽象工厂
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public interface IDatabaseUtils {
    IConnection getConnect();

    ICommand getCommand();
}
