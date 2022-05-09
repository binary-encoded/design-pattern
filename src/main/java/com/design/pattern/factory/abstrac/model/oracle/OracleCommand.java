package com.design.pattern.factory.abstrac.model.oracle;

import com.design.pattern.factory.abstrac.model.ICommand;

/**
 * Oracle数据库命令执行类
 * <p>
 * 具体产品
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class OracleCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("oracle command execute……");
    }
}
