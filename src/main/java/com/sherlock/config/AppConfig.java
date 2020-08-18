package com.sherlock.config;

import com.sherlock.pojo.Order;
import com.sherlock.pojo.User;
import com.sherlock.utils.SherlockImportBeanDefinitionRegistrar;
import com.sherlock.utils.SherlockImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 8:35
 */
@Configuration
@ComponentScan("com.sherlock")
//@Import({User.class, Order.class})
//@Import(SherlockImportSelector.class)
@Import(SherlockImportBeanDefinitionRegistrar.class)
public class AppConfig {

//    @Bean("sherlock")
//    public User user() {
//        return new User("sherlock", 19);
//    }

}
