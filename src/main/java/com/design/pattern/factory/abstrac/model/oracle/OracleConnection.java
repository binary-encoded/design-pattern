package com.design.pattern.factory.abstrac.model.oracle;

import com.design.pattern.factory.abstrac.model.IConnection;

/**
 * Oracle数据库连接类
 * <p>
 * 具体产品
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class OracleConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("oracle get connection……");
    }
}
