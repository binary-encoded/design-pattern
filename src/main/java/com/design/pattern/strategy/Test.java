package com.design.pattern.strategy;

import com.design.pattern.strategy.model.Customer;
import com.design.pattern.strategy.model.MemberStrategyFactory;

/**
 * 策略模式（政策模式）
 * <p>
 * 定义一组算法，将每个算法分装起来，并使他们之间可以相互替换。
 * 策略模式让算法独立于使用它的客户而变化，也称为政策模式。
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Test {
    public static void main(String[] args) {
        Customer peter = new Customer(796.77f, MemberStrategyFactory.getStrategy(1));
        Customer tony = new Customer(889.97f, MemberStrategyFactory.getStrategy(2));
        Float peterAmount = peter.calcPrice();
        System.out.println("peterAmount = " + peterAmount);
        Float tonyAmount = tony.calcPrice();
        System.out.println("tonyAmount = " + tonyAmount);
    }
}
