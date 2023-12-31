package com.shop.common.dozer;



import com.github.pagehelper.PageInfo;
import com.shop.common.vo.PageResult;
import com.shop.common.vo.Paging;

import java.util.List;
import java.util.Set;

/**
 * @ClassName IGenerator
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:09
 * @Version 1.0
 **/
public interface IGenerator {

    /**
     * 转换
     *
     * @param s   数据对象
     * @param clz 复制目标类型
     * @return {@link T}
     * @Description: 单个对象的深度复制及类型转换，vo/domain , po
     */
    <T, S> T convert(S s, Class<T> clz);

    /**
     * @Description: 深度复制结果集(ResultSet为自定义的分页结果集)
     * @param s 数据对象
     * @param clz 复制目标类型
     * @return
     */
    //<T, S> Result<T> convert(Result<S> s, Class<T> clz);

    /**
     * 转换
     * @param s   数据对象
     * @param clz 复制目标类型
     * @return {@link List <T>}
     * @Description: list深度复制
     */
    <T, S> List<T> convert(List<S> s, Class<T> clz);

    /**
     *
     * @param s
     * @param clz
     * @param <T>
     * @param <S>
     * @return
     */
    <T, S> Paging<T> convertPaging(Paging<S> s, Class<T> clz);
    /**
     * @param s   数据对象
     * @param clz 复制目标类型
     * @return
     * @Description: set深度复制
     */
    <T, S> Set<T> convert(Set<S> s, Class<T> clz);

    /**
     * @param s   数据对象
     * @param clz 复制目标类型
     * @return
     * @Description: 数组深度复制
     * @author banjuer@outlook.com
     * @Time 2018年5月9日 下午3:54:57
     */
    <T, S> T[] convert(S[] s, Class<T> clz);

    /**
     * 分页信息转换
     * @return {@link PageResult<T>}
     */
    <T, S> PageResult<T> convertPageInfo(PageInfo<S> s, Class<T> clz);
}

