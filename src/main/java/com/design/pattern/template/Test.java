package com.design.pattern.template;

import com.design.pattern.template.model.BlackBeanMilk;
import com.design.pattern.template.model.SoybeanMilk;

/**
 * 类/接口描述
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Test {
    public static void main(String[] args) {
//        SoybeanMilk peanutSoybeanMilk = new PeanutSoybeanMilk();
//        peanutSoybeanMilk.make();
        SoybeanMilk blackBeanMilk = new BlackBeanMilk();
        blackBeanMilk.make();
    }
}
