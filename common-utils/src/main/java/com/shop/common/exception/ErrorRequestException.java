package com.shop.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @ClassName ErrorRequestException
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:32
 * @Version 1.0
 **/
@Getter
public class ErrorRequestException extends RuntimeException{

    private Integer status = BAD_REQUEST.value();

    public ErrorRequestException(String msg){
        super(msg);
    }

    public ErrorRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}
