package com.design.pattern.prototype.model;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 学校
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
@Data
@Builder
public class School implements Cloneable, Serializable {
    private String name;
    private String address;

    @Override
    protected School clone() throws CloneNotSupportedException {
        return (School) super.clone();
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
