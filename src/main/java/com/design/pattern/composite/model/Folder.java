package com.design.pattern.composite.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 * Composite 容器对象
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Folder implements Counter {
    private List<Counter> children = new ArrayList<>();

    public List<Counter> getChildren() {
        return children;
    }

    public void add(Counter counter) {
        children.add(counter);
    }

    public void remove(Counter counter) {
        children.remove(counter);
    }

    @Override
    public Integer count() {
        if (CollectionUtils.isEmpty(children)) return 0;
        return children.stream().mapToInt(Counter::count).sum();
    }
}
