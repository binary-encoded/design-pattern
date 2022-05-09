package com.design.pattern.factory.abstrac.model.oracle;

import com.design.pattern.factory.abstrac.model.ICommand;
import com.design.pattern.factory.abstrac.model.IConnection;
import com.design.pattern.factory.abstrac.model.IDatabaseUtils;

/**
 * Oracle数据库工具类
 * <p>
 * 具体工厂类
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class OracleDatabaseUtils implements IDatabaseUtils {
    @Override
    public IConnection getConnect() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
