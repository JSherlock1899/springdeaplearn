package com.sherlock.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author: sherlock
 * @description:Aware接口的回调
 * @date: 2020/7/16 23:29
 */
@Component
public class UserService implements BeanNameAware {


    public void test() {
        System.out.println("UserService.test....");
    }
    @Override
    public void setBeanName(String s) {
//        System.out.println("bean的名字为：" + s);
    }
}
