package com.sherlock.utils;

import com.sherlock.pojo.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 13:03
 */
public class SherlockImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //需要的业务逻辑
        //指定bean定义信息（包括bean的类型、作用域...）
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        registry.registerBeanDefinition("user",beanDefinition);
    }
}
