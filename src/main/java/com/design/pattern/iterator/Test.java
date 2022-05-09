package com.design.pattern.iterator;

import com.alibaba.fastjson.JSON;
import com.design.pattern.iterator.model.*;

/**
 * 迭代器模式
 * <p>
 * 迭代器模式提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露对象内部的细节。
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Test {
    public static void main(String[] args) {
        Teacher peter = Teacher.builder()
                .name("peter")
                .age(22)
                .position("英语老师")
                .build();

        Teacher tony = Teacher.builder()
                .name("Tony")
                .age(22)
                .position("体育老师")
                .build();

        Student zhangsan = Student.builder()
                .name("张三")
                .age(12)
                .clazz("六年一班")
                .headTeacher(peter)
                .build();

        Student lisi = Student.builder()
                .name("李四")
                .age(13)
                .clazz("六年一班")
                .headTeacher(peter)
                .build();

        Student wangwu = Student.builder()
                .name("王五")
                .age(12)
                .clazz("六年二班")
                .headTeacher(tony)
                .build();

        Student laoliu = Student.builder()
                .name("老六")
                .age(11)
                .clazz("六年二班")
                .headTeacher(tony)
                .build();

        School school = School.builder()
                .appendPersonnel(peter)
                .appendPersonnel(tony)
                .appendPersonnel(zhangsan)
                .appendPersonnel(lisi)
                .appendPersonnel(wangwu)
                .appendPersonnel(laoliu)
                .build();

        Iterator iterator = school.iterator();
        while (iterator.hasNext()) {
            Personnel personnel = (Personnel) iterator.next();
            System.err.println("personnel = " + JSON.toJSONString(personnel));
        }
    }
}
