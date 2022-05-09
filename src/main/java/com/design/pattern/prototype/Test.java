package com.design.pattern.prototype;

import com.design.pattern.prototype.model.School;
import com.design.pattern.prototype.model.Student;
import com.design.pattern.prototype.model.Teacher;

import java.util.ArrayList;

/**
 * 原型模式
 * <p>
 * 原型模式隶属于创建型模式，主要是用于创建重复的对象，
 * 但每个对象都具有独立的内存地址与指针，互不关联，修
 * 改其中一个对象的属性，其他对象不会做出改变。
 * <p>
 * 该模式的思想就是将一个对象作为原型，对其进行复制，克隆，产生一个和原对象类似的新对象。
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Student> students = new ArrayList<Student>() {{
            add(Student.builder().name("小明").clazz("六年一班").age(18).build());
            add(Student.builder().name("小红").clazz("六年一班").age(19).build());
        }};
        Teacher teacher1 = Teacher.builder()
                .name("张老师").age(28).job("英语老师")
                .students(students)
                .school(School.builder().name("徐汇区第一中心小学").address("徐汇区嘉善路5号").build())
                .build();
        Teacher teacher2 = teacher1.deepClone();
        System.out.println(teacher1 == teacher2);
        System.out.println("teacher1 = " + teacher1.toJSONString());
        System.out.println("teacher2 = " + teacher2.toJSONString());
        teacher2.getStudents().add(Student.builder().name("小白").clazz("六年一班").age(19).build());
        System.out.println("--------修改students后--------");
        System.out.println("teacher1 = " + teacher1.toJSONString());
        System.out.println("teacher2 = " + teacher2.toJSONString());
        teacher1.getSchool().setName("黄浦区曹光彪小学");
        teacher1.getSchool().setAddress("黄浦区长沙路1号");
        System.out.println("--------修改school后--------");
        System.out.println("teacher1 = " + teacher1.toJSONString());
        System.out.println("teacher2 = " + teacher2.toJSONString());
    }
}
