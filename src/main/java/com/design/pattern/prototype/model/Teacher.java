package com.design.pattern.prototype.model;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * 教师类
 * <p>
 * 原型类 Prototype
 * <p>
 * 原型类必须实现`Cloneable`接口，重写clone()方法
 *
 * @author 曾俊凯
 * @date 2022/4/29
 */
@Data
@Builder
public class Teacher implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String job;
    private List<Student> students;
    private School school;

    /**
     * 浅拷贝
     * `students`属性还是浅拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Teacher clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        School school = teacher.getSchool().clone();
        teacher.setSchool(school);
        return teacher;
    }

    /**
     * 深拷贝
     *
     * @return
     */
    public Teacher deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Teacher) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
