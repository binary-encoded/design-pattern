package com.design.pattern.prototype.model;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 学生
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
@Data
@Builder
public class Student implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String clazz;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        return clone;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
