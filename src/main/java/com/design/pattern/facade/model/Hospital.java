package com.design.pattern.facade.model;

/**
 * 医院类
 * Subsystem 子系统角色，可以有多个或一个
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Hospital {
    public void register() {
        System.out.println("挂号……");
    }

    public void outpatient() {
        System.out.println("门诊……");
    }

    public void pay() {
        System.out.println("缴费……");
    }

    public void TakeMedicine() {
        System.out.println("取药……");
    }
}
