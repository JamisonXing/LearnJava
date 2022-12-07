package com.jamison.reflection;

import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射操作这个类的方法和参数
 * @author jamison
 */
public class TestTargetObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的class对象并且创建TargetObject类实例
         */
        Class<?> targetClass = Class.forName("com.jamison.reflection.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        /**
         * 获取TargetObject类中定义所有方法
         */
        Method[] methods = targetClass.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "jamison");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field filed = targetClass.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        filed.setAccessible(true);
        filed.set(targetObject, "jamison");

        /**
         * 调用private方法
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        //为了调用private我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
