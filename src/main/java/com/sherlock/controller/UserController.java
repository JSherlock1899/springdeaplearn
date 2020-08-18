package com.sherlock.controller;

import com.sherlock.annotation.AutoWired;
import com.sherlock.service.UserService;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/7/16 23:29
 */
public class UserController {

    @AutoWired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
