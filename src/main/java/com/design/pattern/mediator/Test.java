package com.design.pattern.mediator;

import com.design.pattern.mediator.model.Customer;
import com.design.pattern.mediator.model.HouseOwner;
import com.design.pattern.mediator.model.RentalMediator;
import com.design.pattern.mediator.model.Tenant;

/**
 * 中介者模式
 * <p>
 * 定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立改变它们之间的交互。
 * 中介者模式又叫调停模式，他是迪米特法则的典型应用。
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class Test {
    public static void main(String[] args) {
        RentalMediator rentalMediator = new RentalMediator();
        Customer zhangsan = new Tenant("张三", rentalMediator);
        Customer lisi = new Tenant("李四", rentalMediator);
        Customer wangwu = new Tenant("王五", rentalMediator);
        Customer longjui = new HouseOwner("龙九", rentalMediator);
        Customer zhaosi = new HouseOwner("赵四", rentalMediator);
        rentalMediator.addCustomer(zhangsan);
        rentalMediator.addCustomer(lisi);
        rentalMediator.addCustomer(wangwu);
        rentalMediator.addCustomer(longjui);
        rentalMediator.addCustomer(zhaosi);

        zhangsan.contact("我需要租一个1200以内的房子。");
        longjui.contact("我没有1200以内的房子。");
        zhaosi.contact("我有1200以内的房子。");
    }
}
