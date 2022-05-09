package com.design.pattern.iterator.model;

import lombok.Builder;
import lombok.Data;

/**
 * 学生类
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
@Data
@Builder
public class Student extends Personnel {
    private String name;
    private Integer age;
    private String clazz;
    private Teacher headTeacher;
}
