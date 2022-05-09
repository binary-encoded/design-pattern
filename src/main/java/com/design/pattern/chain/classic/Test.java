package com.design.pattern.chain.classic;

import com.design.pattern.chain.classic.model.BossHandler;
import com.design.pattern.chain.classic.model.CheckHandler;
import com.design.pattern.chain.classic.model.GroupHandler;
import com.design.pattern.chain.classic.model.ManagerHandler;

/**
 * 经典责任链模式
 * <p>
 * 遍历链条上的节点，直到找到对应的节点，然后处理为止。
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Test {
    public static void main(String[] args) {
        CheckHandler checkHandler = CheckHandler.builder()
                .appendHandler(new GroupHandler())
                .appendHandler(new ManagerHandler())
                .appendHandler(new BossHandler())
                .build();
        Boolean result = checkHandler.handler(10);
        System.out.println("请假是否成功：" + result);
    }
}
