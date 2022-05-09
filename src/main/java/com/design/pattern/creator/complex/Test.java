package com.design.pattern.creator.complex;

import com.design.pattern.creator.complex.model.Human;
import com.design.pattern.creator.complex.model.HumanDirector;
import com.design.pattern.creator.complex.model.SmartHumanBuilder;
import com.design.pattern.creator.complex.model.TallPersonBuilder;

/**
 * 创建者模式
 * <p>
 * 用于创建，构造过程比较复杂的对象
 *
 * @author 曾俊凯
 * @date 2022/5/1
 */
public class Test {
    public static void main(String[] args) {
        HumanDirector humanDirector = new HumanDirector();
        Human smartHuman = humanDirector.createHumanByDirector(new SmartHumanBuilder());
        System.err.println("smartHuman = " + smartHuman.toString());
        Human tallPerson = humanDirector.createHumanByDirector(new TallPersonBuilder());
        System.err.println("tallPerson = " + tallPerson.toString());
    }
}
