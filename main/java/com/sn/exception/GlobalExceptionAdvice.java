package com.sn.exception;


import com.sn.entity.common.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@Order(Ordered.LOWEST_PRECEDENCE - 1)
@RestControllerAdvice
public class GlobalExceptionAdvice {
    private final ResultMap resultMap;
    
    public GlobalExceptionAdvice(ResultMap resultMap) {
        this.resultMap = resultMap;
    }
    
    @ExceptionHandler(Exception.class)
    public ResultMap handleException(Exception e) throws Exception {
        log.error(e.getMessage(), e);

        // 如果某个自定义异常有@ResponseStatus注解，就继续抛出
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        // 实际项目中应该这样写，防止用户看到详细的异常信息
        // return new Result().fail().message.message("操作失败");
        return resultMap.fail().msg(e.getMessage());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthenticatedException.class)
    public ResultMap handleUnauthenticatedException(Exception e) {
        log.error(e.getMessage(), e);
        return resultMap.fail().msg("登录失效,请重新登录");
//        return resultMap.fail().message(e.getMessage());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(UnauthorizedException.class)
    public ResultMap handleUnauthorizedException(Exception e) {
        log.error(e.getMessage(), e);
        return resultMap.fail().msg("权限不足");
//        return resultMap.fail().message(e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public ResultMap handleBusinessException(Exception e) throws Exception {
        log.error(e.getMessage(), e);

        // 如果某个自定义异常有@ResponseStatus注解，就继续抛出
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        // 实际项目中应该这样写，防止用户看到详细的异常信息
        // return resultMap.fail().message("操作失败");
        return resultMap.fail().msg(e.getMessage());
    }
}