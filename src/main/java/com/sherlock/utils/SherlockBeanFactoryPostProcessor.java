package com.sherlock.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: sherlock
 * @description:向spring容器中添加一个Bean
 * @date: 2020/8/18 10:24
 */
@Component
public class SherlockBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

//        beanFactory.registerSingleton("sherlock", new User("sherlock", 18));

    }
}
