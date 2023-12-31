package com.shop.common.exception;

import org.springframework.util.StringUtils;

/**
 * @ClassName EntityNotFoundException
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:36
 * @Version 1.0
 **/
public class EntityNotFoundException extends RuntimeException{

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }

    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }
}
