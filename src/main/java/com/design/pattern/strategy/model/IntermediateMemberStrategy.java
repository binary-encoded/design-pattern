package com.design.pattern.strategy.model;

import java.math.BigDecimal;

/**
 * 中级会员策略
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    private BigDecimal discount = BigDecimal.valueOf(0.8);

    @Override
    public BigDecimal calcPrice(BigDecimal amount) {
        return amount.multiply(discount);
    }
}
