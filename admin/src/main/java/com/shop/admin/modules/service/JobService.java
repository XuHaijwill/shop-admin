package com.shop.admin.modules.service;

import com.shop.admin.entity.Job;
import com.shop.admin.modules.dto.JobDto;
import com.shop.admin.modules.dto.JobQueryCriteria;
import com.shop.mybatis.common.service.BaseService;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JobService
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:56
 * @Version 1.0
 **/
public interface JobService extends BaseService<Job> {

    /**
     * 查询数据分页
     * @param criteria 条件
     * @param pageable 分页参数
     * @return Map<String,Object>
     */
    Map<String,Object> queryAll(JobQueryCriteria criteria, Pageable pageable);

    /**
     * 查询所有数据不分页
     * @param criteria 条件参数
     * @return List<JobDto>
     */
    List<Job> queryAll(JobQueryCriteria criteria);

    /**
     * 导出数据
     * @param all 待导出的数据
     * @param response /
     * @throws IOException /
     */
    void download(List<JobDto> all, HttpServletResponse response) throws IOException;

}
