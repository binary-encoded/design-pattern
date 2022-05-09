package com.design.pattern.facade;

import com.design.pattern.facade.model.Consultant;

/**
 * 门面模式（外观模式）
 * <p>
 * 门面模式要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。
 * 门面模式提供一个高层次的接口，使得子系统更易于使用。
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class Test {
    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        consultant.seeDoctor();
    }
}
