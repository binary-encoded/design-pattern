package com.design.pattern.interpreter.model.expression;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 减法表达式
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class SubtractExpression extends SymbolExpression {
    public SubtractExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public BigDecimal interpreter(Map<String, BigDecimal> var) {
        return super.left.interpreter(var).subtract(super.right.interpreter(var));
    }
}
