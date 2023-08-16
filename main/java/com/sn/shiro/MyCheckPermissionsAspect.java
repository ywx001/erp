package com.sn.shiro;

import com.sn.util.ServletUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 判断车间权限的切面，传参需包含privilegeId和selectId
 */
@Aspect
@Component
@Slf4j
public class MyCheckPermissionsAspect {

    // 定义切点
    @Pointcut(value = "@annotation(com.sn.shiro.MyCheckPermissions)")
    public void pointCut() {

    }

    // 权限判断
    @Before("pointCut()")
    public void before() {
        // 获取请求的参数
        Map<?, ?> paramsMap = ServletUtils.getParamMap(ServletUtils.getRequest());
        // 执行权限判断
        Subject subject = SecurityUtils.getSubject();
        subject.isPermitted(paramsMap.get("privilegeId")+":"+paramsMap.get("selectId"));
    }

}
