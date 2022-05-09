package com.design.pattern.memento.model;

import java.util.Stack;

/**
 * 备忘录栈
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class History {
    private Stack<BackUp> mementoStack = new Stack<>();

    public void add(BackUp backUp) {
        this.mementoStack.add(backUp);
    }

    public BackUp getLastVersion() {
        return mementoStack.pop();
    }
}
