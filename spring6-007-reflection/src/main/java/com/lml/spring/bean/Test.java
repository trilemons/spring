package com.lml.spring.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws Exception {
        String className = "com.lml.spring.bean.User";
        String propertyName = "age";

        Class clazz = Class.forName(className);
        Constructor declaredConstructors = clazz.getDeclaredConstructor();
        Object o = declaredConstructors.newInstance();

        String methodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);

        Field field = clazz.getDeclaredField(propertyName);


        Method setAge = clazz.getDeclaredMethod(methodName, field.getType());
        setAge.invoke(o,18);

        System.out.println(o);


    }
}
