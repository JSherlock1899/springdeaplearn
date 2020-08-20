package com.sherlock.config;

import com.sherlock.pojo.Order;
import com.sherlock.pojo.User;
import com.sherlock.utils.SherlockImportBeanDefinitionRegistrar;
import com.sherlock.utils.SherlockImportSelector;
import org.springframework.context.annotation.*;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 8:35
 */
@Configuration
@ComponentScan("com.sherlock")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AppConfig {

}
