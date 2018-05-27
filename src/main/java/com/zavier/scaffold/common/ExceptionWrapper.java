package com.zavier.scaffold.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理
 */
@ControllerAdvice
@Slf4j
public class ExceptionWrapper {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String parseException(Exception e) {
        log.error("系统错误", e);
        return "Error";
    }
}
