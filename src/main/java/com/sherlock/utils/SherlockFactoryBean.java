package com.sherlock.utils;

import com.sherlock.pojo.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 11:11
 */
@Component
public class SherlockFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new User("sherlock", 20);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
