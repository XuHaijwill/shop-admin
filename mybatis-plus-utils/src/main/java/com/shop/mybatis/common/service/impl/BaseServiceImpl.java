package com.shop.mybatis.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.mybatis.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName BaseServiceImpl
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/30 20:04
 * @Version 1.0
 **/
@Slf4j
@SuppressWarnings("unchecked")
public abstract class BaseServiceImpl <M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {
//    protected Page setPageParam(QueryParam queryParam) {
//        return setPageParam(queryParam,null);
//    }
}
