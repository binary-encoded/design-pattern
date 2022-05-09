package com.design.pattern.strategy.model;

import java.math.BigDecimal;

/**
 * 会员策略
 * <p>
 * 可以是接口或是抽象类
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public interface MemberStrategy {
    BigDecimal calcPrice(BigDecimal amount);
}
