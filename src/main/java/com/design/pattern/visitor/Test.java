package com.design.pattern.visitor;

import com.design.pattern.visitor.model.BusinessReport;
import com.design.pattern.visitor.model.CEOVisitor;
import com.design.pattern.visitor.model.CTOVisitor;

/**
 * 访问者模式
 * <p>
 * 访问者模式是一种操作一组对象的的模式，它的目的是不改变对象的定义，但允许新增不同的访问者，来定义新的操作。
 * 一般运用于一组稳定的数据结构，但可以有不同的操作来
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Test {
    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
