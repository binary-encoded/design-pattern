package com.design.pattern.facade.model;

/**
 * 接待员
 * Facade 门面角色，可以有一个或多个
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Consultant {
    // 可以有多个子系统，统一有facade层调用客户端不用考虑怎么实现
    private Hospital hospital = new Hospital();

    public void seeDoctor() {
        hospital.register();
        hospital.pay();
        hospital.outpatient();
        hospital.pay();
        hospital.TakeMedicine();
    }


}
