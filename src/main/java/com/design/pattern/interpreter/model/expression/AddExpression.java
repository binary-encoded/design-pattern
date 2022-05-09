package com.design.pattern.interpreter.model.expression;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 加法表达式
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public BigDecimal interpreter(Map<String, BigDecimal> var) {
        return super.left.interpreter(var).add(super.right.interpreter(var));
    }
}
