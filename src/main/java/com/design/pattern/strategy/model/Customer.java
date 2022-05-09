package com.design.pattern.strategy.model;

import java.math.BigDecimal;

/**
 * 客户
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Customer {
    private Float amount;
    private MemberStrategy memberStrategy;

    public Customer(Float amount, MemberStrategy memberStrategy) {
        this.amount = amount;
        this.memberStrategy = memberStrategy;
    }

    public Float calcPrice() {
        return memberStrategy.calcPrice(new BigDecimal(amount)).floatValue();
    }
}
