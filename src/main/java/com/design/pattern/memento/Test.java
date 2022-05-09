package com.design.pattern.memento;

import com.design.pattern.memento.model.Document;
import com.design.pattern.memento.model.History;

/**
 * 备忘录模式
 *
 * @author 曾俊凯
 * @date 2022/5/5
 */
public class Test {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();

        document.change("曾俊凯");
        history.add(document.save());

        document.change("胡雅晨");

        document.print();

        document.resume(history.getLastVersion());

        document.print();
    }
}
