package com.design.pattern.factory.abstrac.model.mysql;

import com.design.pattern.factory.abstrac.model.ICommand;
import com.design.pattern.factory.abstrac.model.IConnection;
import com.design.pattern.factory.abstrac.model.IDatabaseUtils;

/**
 * mysql数据库工具类
 * <p>
 * 具体工厂
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class MySqlDatabaseUtils implements IDatabaseUtils {
    @Override
    public IConnection getConnect() {
        return new MySqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MySqlCommand();
    }
}
