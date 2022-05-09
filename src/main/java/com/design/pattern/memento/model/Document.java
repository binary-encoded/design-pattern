package com.design.pattern.memento.model;

/**
 * 文档类
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class Document {
    private String content;

    public BackUp save() {
        return new BackUp(content);
    }

    public void resume(BackUp backUp) {
        this.content = backUp.getContent();
    }

    public void change(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("content = " + content);
    }
}
