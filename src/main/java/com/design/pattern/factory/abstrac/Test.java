package com.design.pattern.factory.abstrac;

import com.design.pattern.factory.abstrac.model.ICommand;
import com.design.pattern.factory.abstrac.model.IConnection;
import com.design.pattern.factory.abstrac.model.IDatabaseUtils;
import com.design.pattern.factory.abstrac.model.mysql.MySqlDatabaseUtils;
import com.design.pattern.factory.abstrac.model.oracle.OracleDatabaseUtils;

/**
 * 抽象工厂模式
 * <p>
 * 抽象工厂模式是提供一个创建一系列相关或互相依赖对象的接口，而无须指定他们具体的类。
 * 抽象工厂模式又称为Kit模式，属于修创建型模式。
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        IDatabaseUtils mySqlDatabaseUtils = new MySqlDatabaseUtils();
        IConnection mySqlConnect = mySqlDatabaseUtils.getConnect();
        mySqlConnect.connect();
        ICommand mySqlCommand = mySqlDatabaseUtils.getCommand();
        mySqlCommand.command();

        System.err.println("-----------------------------");
        Thread.sleep(200);
        OracleDatabaseUtils oracleDatabaseUtils = new OracleDatabaseUtils();
        IConnection oracleConnect = oracleDatabaseUtils.getConnect();
        oracleConnect.connect();
        ICommand oracleCommand = oracleDatabaseUtils.getCommand();
        oracleCommand.command();
    }
}
