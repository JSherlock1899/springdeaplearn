package com.sherlock.utils;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/18 12:53
 */
public class SherlockImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //前面可以是和业务相关的逻辑
        //返回需要导入的组件的全类名数组
        return new String[]{"com.sherlock.pojo.User"};
    }
}
