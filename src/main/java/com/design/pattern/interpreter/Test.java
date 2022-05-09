package com.design.pattern.interpreter;

import com.design.pattern.interpreter.model.Calculator;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 解释器模式
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.err.print("请输入表达式(只能输入加法和减法运算)：");
        String input = reader.readLine();
        if (StringUtils.isEmpty(input)) {
            System.err.println("表达式不能为NULL……");
            return;
        }

        StringTokenizer st = new StringTokenizer(input, "+-");
        Map<String, BigDecimal> varMap = new HashMap<>();
        while (st.hasMoreTokens()) {
            String varKey = st.nextToken();
            if (varMap.containsKey(varKey)) continue;
            System.err.print(String.format("请输入[%s]的值：", varKey));
            String var = reader.readLine();
            varMap.put(varKey, new BigDecimal(var));
        }

        Calculator calculator = new Calculator(input);
        BigDecimal result = calculator.run(varMap);
        System.err.println(String.format("运算结果：%s=%d", input, result.intValue()));
    }
}
