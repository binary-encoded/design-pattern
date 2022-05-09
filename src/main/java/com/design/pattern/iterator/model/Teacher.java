package com.design.pattern.iterator.model;

import lombok.Builder;
import lombok.Data;

/**
 * 老师类
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
@Data
@Builder
public class Teacher extends Personnel {
    private String name;
    private Integer age;
    private String position;
}
