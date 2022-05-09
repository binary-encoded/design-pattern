package com.design.pattern.proxy.javassist.model;

import javassist.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 使用Javassist实现动态代理，更强更高级
 * B站-鲁班大叔
 *
 * @author 曾俊凯
 * @date 2022/5/2
 */
public class ProxyClassFactory {
    public static IPhone getInstance() throws Exception {
        // javassist ---> ASM ---> JVM指令码
        ClassPool classPool = new ClassPool();
        // 把当前的 classload 附加到 classPool 中
        classPool.appendSystemPath();
        // 1.创建一个类
        CtClass xiaoMiPhoneClass = classPool.makeClass("XiaoMiPhone");
        // 2.添加接口（实现该接口）
        xiaoMiPhoneClass.addInterface(classPool.get(IPhone.class.getName()));
        // 3.创建方法
        CtMethod call = CtNewMethod.make(CtClass.voidType, // 返回值类型
                "call", // 方法名
                new CtClass[]{classPool.get(String.class.getName())}, // 参数
                new CtClass[0], // 抛出异常
                "{System.out.println(\"phone call for\t\" + $1);}", // 方法体
                xiaoMiPhoneClass); //添加的类
        xiaoMiPhoneClass.addMethod(call);
        // 4.实例化这个对象
        Class aClass = classPool.toClass(xiaoMiPhoneClass);
        return (IPhone) aClass.newInstance();
    }

    private static Integer count = 0;

    public static <T> T getInstance(Class<T> clazz, InvocationHandler handler) throws Exception {
        ClassPool classPool = new ClassPool();
        classPool.appendSystemPath();
        // 1.创建代理类
        String className = clazz.getName();
        CtClass tClass = classPool.makeClass(String.format("%s$Proxy%d", className, count++));
        // 2.添加handler属性
        CtField field = CtField.make("public com.design.mode.proxy.javassist.model.InvocationHandler handler = null;", tClass);
        tClass.addField(field);
        // 2.添加接口（实现该接口）
        tClass.addInterface(classPool.get(className));
        // 3.创建方法
        for (Method method : clazz.getMethods()) {
            CtClass returnType = classPool.get(method.getReturnType().getName());
            String methodName = method.getName();
            CtClass[] params = toCtClasses(classPool, method.getParameterTypes());
            CtClass[] errors = toCtClasses(classPool, method.getExceptionTypes());
            String methodBody;
            if (Void.class.equals(returnType)) {
                methodBody = "this.handler.invoke(\"%s\",$args);";
            } else {
                methodBody = "return ($r)this.handler.invoke(\"%s\",$args);";
            }
            CtMethod ctMethod = CtNewMethod.make(returnType,
                    methodName,
                    params,
                    errors,
                    String.format(methodBody, methodName),
                    tClass);
            tClass.addMethod(ctMethod);
        }
        // 4.实例化这个对象
        Class aClass = classPool.toClass(tClass);
        Object proxy = aClass.newInstance();
        aClass.getField("handler").set(proxy, handler);
        return (T) proxy;
    }

    private static CtClass[] toCtClasses(ClassPool classPool, Class[] classes) {
        return Arrays.stream(classes).map(clazz -> {
            try {
                return classPool.get(clazz.getName());
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList())
                .toArray(new CtClass[0]);
    }
}
