package com.design.pattern.interpreter.model.expression;

import com.design.pattern.interpreter.model.expression.AbstractExpression;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 变量表达式-终结表达式
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class VarExpression extends AbstractExpression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public BigDecimal interpreter(Map<String, BigDecimal> var) {
        if (StringUtils.isEmpty(key)) return BigDecimal.ZERO;
        return Optional.ofNullable(var.get(key)).orElse(BigDecimal.ZERO);
    }
}
