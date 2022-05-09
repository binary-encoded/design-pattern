package com.design.pattern.factory.abstrac.model.mysql;

import com.design.pattern.factory.abstrac.model.IConnection;

/**
 * mysql数据库连接类
 * <p>
 * 具体产品
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class MySqlConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("mysql get connection……");
    }
}
