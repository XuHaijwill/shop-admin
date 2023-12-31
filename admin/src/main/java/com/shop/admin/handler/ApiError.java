package com.shop.admin.handler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName ApiError
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:26
 * @Version 1.0
 **/
@Data
class ApiError {

    private Integer status = 400;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    private String message;

    private ApiError() {
        timestamp = LocalDateTime.now();
    }

    public ApiError(Integer status, String message) {
        this();
        this.status = status;
        this.message = message;
    }

    public static ApiError error(String message){
        ApiError apiError = new ApiError();
        apiError.setMessage(message);
        return apiError;
    }

    public static ApiError error(Integer status, String message){
        ApiError apiError = new ApiError();
        apiError.setStatus(status);
        apiError.setMessage(message);
        return apiError;
    }
}
