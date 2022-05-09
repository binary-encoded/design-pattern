package com.design.pattern.visitor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工业务报表类
 * <p>
 * ObjectStructure 对象结构，包含了具体目标的容器
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class BusinessReport {
    private List<Staff> staffs;

    public BusinessReport() {
        staffs = new ArrayList<>();
        staffs.add(new Manager("经理-A"));
        staffs.add(new Engineer("工程师-A"));
        staffs.add(new Engineer("工程师-B"));
        staffs.add(new Engineer("工程师-C"));
        staffs.add(new Manager("经理-B"));
        staffs.add(new Engineer("工程师-D"));
    }

    /**
     * 为访问者展示报表
     *
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor) {
        staffs.forEach(staff -> staff.accept(visitor));
    }
}
