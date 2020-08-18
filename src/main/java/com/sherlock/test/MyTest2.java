package com.sherlock.test;

import com.sherlock.annotation.AutoWired;
import com.sherlock.controller.UserController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PreDestroy;
import java.io.FileInputStream;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/7/17 12:40
 */
public class MyTest2 {

    @Test
    public void test() {
        UserController userController = new UserController();
        Class clazz = userController.getClass();
        //遍历类中的属性
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            //允许访问私有属性
            field.setAccessible(true);
            //判断是否有AutoWired注解
            AutoWired annotation = field.getAnnotation(AutoWired.class);
            //若添加了AtuoWired注解，则给该属性赋对应的实例化对象
            if (annotation != null) {
                //获取属性类型
                Class<?> type = field.getType();
                try {
                    //实例化该属性
                    Object o = type.newInstance();
                    //赋值
                    field.set(userController, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }


}
