package com.design.pattern.adapter.clazz;


import com.design.pattern.adapter.clazz.model.MD5EncryptAdaptor;

/**
 * 类适配器模式
 * <p>
 * 将一个类的接口转换成客户期望的另一个接口，适配器(Adapter)让原本接口不兼容的类可以相互合作。
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class Test {
    public static void main(String[] args) {
        MD5EncryptAdaptor md5EncryptAdaptor = new MD5EncryptAdaptor();
        String encrypt = md5EncryptAdaptor.encrypt("曾俊凯");
        System.out.println("md5 encrypt = " + encrypt);
    }
}
