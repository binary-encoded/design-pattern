package com.design.pattern.chain.classic.model;

/**
 * 公司组长
 * <p>
 * 链节点
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class GroupHandler extends CheckHandler {
    @Override
    public Boolean handler(Integer date) {
        if (date > 3) {
            System.out.println("组长权限不够，转到上级领导审批");
            if (handler != null) {
                return handler.handler(date);
            }
            return false;
        }
        System.out.println("组长审批通过");
        return true;
    }
}
