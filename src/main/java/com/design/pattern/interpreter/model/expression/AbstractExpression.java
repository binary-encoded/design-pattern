package com.design.pattern.interpreter.model.expression;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 抽象表达式
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public abstract class AbstractExpression {
    public abstract BigDecimal interpreter(Map<String, BigDecimal> var);
}
