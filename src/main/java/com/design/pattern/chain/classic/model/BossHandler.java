package com.design.pattern.chain.classic.model;

/**
 * 公司老板
 * <p>
 * 链节点
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class BossHandler extends CheckHandler {
    @Override
    public Boolean handler(Integer date) {
        System.out.println("老板审批通过");
        return true;
    }
}
