package com.sherlock.service;

import org.springframework.stereotype.Service;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/20 14:52
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void test() {
        System.out.println("OrderServiceImpl");
    }
}
