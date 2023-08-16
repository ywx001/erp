package com.sn.shiro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 判断车间权限注解
 * 由于车间属于多个重复模块，每个车间权限需加以区分， 重新定义接口专门使用
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCheckPermissions {

}
