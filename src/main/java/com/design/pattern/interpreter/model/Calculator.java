package com.design.pattern.interpreter.model;

import com.design.pattern.interpreter.model.expression.AbstractExpression;
import com.design.pattern.interpreter.model.expression.AddExpression;
import com.design.pattern.interpreter.model.expression.SubtractExpression;
import com.design.pattern.interpreter.model.expression.VarExpression;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * 计算器类
 *
 * @author 曾俊凯
 * @date 2022/5/8
 */
public class Calculator {
    private AbstractExpression expression;

    public Calculator(String input) {
        if (StringUtils.isEmpty(input)) return;

        // 安排运算先后顺序
        Stack<AbstractExpression> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(input, "+-", true);
        List<String> expressions = new ArrayList<>();
        while (st.hasMoreTokens()) {
            expressions.add(st.nextToken());
        }

        AbstractExpression left;
        AbstractExpression right;
        for (int i = 0; i < expressions.size(); i++) {
            switch (expressions.get(i)) {
                case "+":
                    left = stack.pop();
                    right = new VarExpression(expressions.get(++i));
                    stack.push(new AddExpression(left, right));
                    break;
                case "-":
                    left = stack.pop();
                    right = new VarExpression(expressions.get(++i));
                    stack.push(new SubtractExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(expressions.get(i)));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public BigDecimal run(Map<String, BigDecimal> var) {
        return this.expression.interpreter(var);
    }
}
