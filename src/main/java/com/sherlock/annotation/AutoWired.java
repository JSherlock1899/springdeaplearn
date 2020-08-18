package com.sherlock.annotation;

import java.lang.annotation.*;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/7/17 12:28
 */
//当前注解的作用域
@Retention(RetentionPolicy.RUNTIME)
//当前注解放在哪
@Target(ElementType.FIELD)
//当前注解是否能被继承
@Inherited
//当前注解是否在文档中展现
@Documented
public @interface AutoWired {
}
