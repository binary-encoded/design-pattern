package com.design.pattern.composite;

import com.design.pattern.composite.model.File;
import com.design.pattern.composite.model.Folder;

/**
 * 组合模式
 * <p>
 * 组合模式又叫部分整体模式，是用于把一组相似的对象，当做单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类
 * 型的设计模式属于结构型模式，它提供了修改相同对象组的方式。
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public class Test {
    public static void main(String[] args) {
        Folder folder = init();
        Integer count = folder.count();
        // count = folder下面的文件数
        System.out.println("count = " + count);
    }

    private static Folder init() {
        Folder folder = new Folder();
        folder.add(new File());
        folder.add(new File());
        folder.add(new File());
        folder.add(new File());
        Folder childrenFolder1 = new Folder();
        childrenFolder1.add(new File());
        childrenFolder1.add(new File());
        childrenFolder1.add(new File());
        childrenFolder1.add(new File());
        Folder childrenFolder2 = new Folder();
        childrenFolder2.add(new File());
        childrenFolder2.add(new File());
        childrenFolder2.add(new File());
        childrenFolder2.add(new File());
        Folder childrenFolder3 = new Folder();
        childrenFolder3.add(new File());
        childrenFolder3.add(new File());
        childrenFolder3.add(new File());
        childrenFolder3.add(new File());
        childrenFolder2.add(childrenFolder3);
        folder.add(childrenFolder1);
        folder.add(childrenFolder2);
        return folder;
    }

}
