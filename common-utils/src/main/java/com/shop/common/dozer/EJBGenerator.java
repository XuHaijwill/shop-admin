package com.shop.common.dozer;


import com.github.pagehelper.PageInfo;
import com.shop.common.vo.PageResult;
import com.shop.common.vo.Paging;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @ClassName EJBGenerator
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:10
 * @Version 1.0
 **/
@Component
@Lazy()
public class EJBGenerator implements IGenerator {

    @Autowired
    protected Mapper dozerMapper;

    @Override
    public <T, S> T convert(final S s, Class<T> clz) {
        return s == null ? null : this.dozerMapper.map(s, clz);
    }

    @Override
    public <T, S> List<T> convert(List<S> s, Class<T> clz) {
        return s == null ? null : s.stream().map(vs -> this.dozerMapper.map(vs, clz)).collect(Collectors.toList());
    }

    @Override
    public <T, S> Paging<T> convertPaging(Paging<S> paging, Class<T> clz) {
        Paging<T> pagingVo=new  Paging<T>();
        pagingVo.setRecords(convert(paging.getRecords(),clz));
        pagingVo.setTotal(paging.getTotal());
        return pagingVo;
    }

    @Override
    public <T, S> Set<T> convert(Set<S> s, Class<T> clz) {
        return s == null ? null : s.stream().map(vs -> this.dozerMapper.map(vs, clz)).collect(Collectors.toSet());
    }

    @Override
    public <T, S> T[] convert(S[] s, Class<T> clz) {
        if (s == null) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) Array.newInstance(clz, s.length);
        for (int i = 0; i < s.length; i++) {
            arr[i] = this.dozerMapper.map(s[i], clz);
        }
        return arr;
    }

    @Override
    public <T, S> PageResult<T> convertPageInfo(PageInfo<S> s, Class<T> clz) {
        return new PageResult(s.getTotal(), convert(s.getList(), clz));
    }
}

