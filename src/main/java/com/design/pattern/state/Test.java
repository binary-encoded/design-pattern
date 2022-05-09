package com.design.pattern.state;

import com.design.pattern.state.model.CompanyContext;

/**
 * 状态模式
 * <p>
 * 状态模式主要用来解决对象在多种状态转换时，需要对外输出不同的行为的问题。
 * 状态和行为是一一对应的，状态之间可以相互转换。当一个对象的内在状态改变时，
 * 允许改变其行为，这个对象看起来像是改变了其类。
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Test {
    public static void main(String[] args) {
        CompanyContext companyContext = new CompanyContext();
        companyContext.handle();
        companyContext.handle();
        companyContext.handle();
    }
}