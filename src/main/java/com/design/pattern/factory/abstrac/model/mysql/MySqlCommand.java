package com.design.pattern.factory.abstrac.model.mysql;

import com.design.pattern.factory.abstrac.model.ICommand;

/**
 * mysql数据库命令执行类
 * <p>
 * 具体产品
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class MySqlCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("mysql command execute……");
    }
}
