package com.design.pattern.iterator.model;

/**
 * 迭代器接口
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public interface Iterator<T> {
    Boolean hasNext();

    Boolean isEmpty();

    T next();
}
