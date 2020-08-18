package com.sherlock.pojo;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 10:25
 */
public class User {

    String username;
    Integer password;

    public User(String username, Integer password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
