package com.mjtal.common.product.exception;

import com.mjtal.common.exception.BizCodeEnume;
import com.mjtal.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @Author: june
 * @Date: 2023/9/5 20:59
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.mjtal.common.product.controller")
public class GlobleExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handlerVaildException(MethodArgumentNotValidException validException){
        log.error("数据校验出现问题{},异常类型:{}",validException.getMessage(),validException.getClass());
        HashMap<String, String> map = new HashMap<>();
        validException.getFieldErrors().forEach((item)->{
            String objectName = item.getObjectName();
            String defaultMessage = item.getDefaultMessage();
            map.put(objectName,defaultMessage);
        });
        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(),BizCodeEnume.UNKNOW_EXCEPTION.getMsg()).put("data",map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R MaxException(Throwable throwable){

        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(),BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
    }
}
