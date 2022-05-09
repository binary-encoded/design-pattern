package com.design.pattern.composite.model;

/**
 * 文件类
 * Leaf 叶子对象
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class File implements Counter {
    private Integer count = 1;

    @Override
    public Integer count() {
        return count;
    }
}
