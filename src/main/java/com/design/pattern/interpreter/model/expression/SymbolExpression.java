package com.design.pattern.interpreter.model.expression;

import com.design.pattern.interpreter.model.expression.AbstractExpression;

/**
 * 符号表达式-非终结表达式
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public abstract class SymbolExpression extends AbstractExpression {
    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
