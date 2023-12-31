package com.shop.common.utils;

import com.shop.common.exception.BadRequestException;

import javax.validation.ConstraintViolationException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @ClassName ThrowableUtil
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 19:28
 * @Version 1.0
 **/
public class ThrowableUtil {

    /**
     * 获取堆栈信息
     */
    public static String getStackTrace(Throwable throwable){
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }

    public static void throwForeignKeyException(Throwable e, String msg){
        Throwable t = e.getCause();
        while ((t != null) && !(t instanceof ConstraintViolationException)) {
            t = t.getCause();
        }
        if (t != null) {
            throw new BadRequestException(msg);
        }
        assert false;
        throw new BadRequestException("删除失败：" + t.getMessage());
    }
}
