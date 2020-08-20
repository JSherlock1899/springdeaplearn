package com.sherlock;

import com.sherlock.controller.UserController;
import com.sherlock.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/7/16 23:33
 */
public class MyTest {


    @Test
    public void test() throws Exception {
        UserController userController = new UserController();
        //创建好userService
        UserService userService = new UserService();
        System.out.println(userService);
        Class clazz = userController.getClass();
        //获取类中的属性
        Field serviceField = clazz.getDeclaredField("userService");
        //允许私有属性访问
        serviceField.setAccessible(true);
        //获取属性名
        String name = serviceField.getName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        //拼接出set方法名
        String methodName = "set" + name;
        //获取方法对象
        Method method = clazz.getMethod(methodName, UserService.class);
        //调用方法
        method.invoke(userController, userService);
        System.out.println(userController.getUserService());

    }
}
