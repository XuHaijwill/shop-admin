package com.shop.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @ClassName BadRequestException
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:29
 * @Version 1.0
 **/
@Getter
public class BadRequestException extends RuntimeException{
    private Integer status = BAD_REQUEST.value();

    public BadRequestException(String msg){
        super(msg);
    }

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}
