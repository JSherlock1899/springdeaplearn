package com.sherlock;

import com.sherlock.config.AppConfig;
import com.sherlock.pojo.User;
import com.sherlock.service.OrderService;
import com.sherlock.service.OrderServiceImpl;
import com.sherlock.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 8:36
 */
public class MyTest3 {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
//        User sherlock = context.getBean("sherlock", User.class);
//        System.out.println(sherlock.toString());
        //注意：这个bean的名字是sherlockFactoryBean，但返回的是User类
//        User user = context.getBean("sherlockFactoryBean", User.class);
        //@import
//        User user = context.getBean("com.sherlock.pojo.User", User.class);
//        System.out.println(user.toString());
        //ImportBeanDefinitionRegistrar
//        User user = context.getBean("user", User.class);
//        System.out.println(user.toString());
    }

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService)context.getBean(UserService.class);
        userService.test();
        OrderService orderService = (OrderService)context.getBean("orderServiceImpl");
        orderService.test();
    }
}
