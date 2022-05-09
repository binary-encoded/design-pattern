package com.design.pattern.mediator.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 房屋中介
 * <p>
 * 具体中介类
 *
 * @author 曾俊凯
 * @date 2022/5/4
 */
public class RentalMediator extends Mediator {
    private List<Customer> customers;

    public void addCustomer(Customer customer) {
        if (Objects.isNull(customers)) {
            synchronized (this) {
                if (Objects.isNull(customers)) customers = new ArrayList<>();
            }
        }
        this.customers.add(customer);
    }

    @Override
    protected void contact(String message, Customer customer) {
        if (CollectionUtils.isEmpty(customers) || Objects.isNull(customer)) return;

        customers.stream()
                .filter(cust -> !Objects.equals(customer.getClass().getName(), cust.getClass().getName()))
                .forEach(cust -> cust.getMessage(message, customer));
    }
}
