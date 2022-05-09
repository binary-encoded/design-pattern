package com.design.pattern.memento.model;

/**
 * 备忘录实现类
 *
 * @author 曾俊凯
 * @date 2022/5/6
 */
public class BackUp implements Memento {
    private String content;

    public BackUp(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
