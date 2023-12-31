package com.shop.common.exception;

import org.springframework.util.StringUtils;

/**
 * @ClassName EntityExistException
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:35
 * @Version 1.0
 **/
public class EntityExistException extends RuntimeException{

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " existed";
    }
    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }
}
