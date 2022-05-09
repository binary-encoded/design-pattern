package com.design.pattern.adapter.object;


import com.design.pattern.adapter.object.model.EncryptClient;
import com.design.pattern.adapter.object.model.MD5Algorithm;
import com.design.pattern.adapter.object.model.SHAAlgorithm;

/**
 * 对象适配器模式
 * <p>
 * 将一个类的接口转换成客户期望的另一个接口，适配器(Adapter)让原本接口不兼容的类可以相互合作。
 *
 * @author 曾俊凯
 * @date 2022/4/30
 */
public class Test {
    public static void main(String[] args) {
        EncryptClient encryptClient = new EncryptClient();
        String md5Str = encryptClient.encrypt(new MD5Algorithm(), "曾俊凯");
        System.out.println("md5Str = " + md5Str);
        String shaStr = encryptClient.encrypt(new SHAAlgorithm(), "曾俊凯");
        System.out.println("shaStr = " + shaStr);
    }
}
