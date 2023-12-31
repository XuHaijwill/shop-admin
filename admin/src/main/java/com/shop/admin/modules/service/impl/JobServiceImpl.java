package com.shop.admin.modules.service.impl;

import com.github.pagehelper.PageInfo;
import com.shop.admin.entity.Job;
import com.shop.admin.modules.dto.JobDto;
import com.shop.admin.modules.dto.JobQueryCriteria;
import com.shop.admin.modules.mapper.JobMapper;
import com.shop.admin.modules.service.JobService;
import com.shop.common.dozer.IGenerator;
import com.shop.mybatis.common.service.impl.BaseServiceImpl;
import com.shop.mybatis.common.utils.QueryHelpPlus;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JobServiceImpl
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:03
 * @Version 1.0
 **/
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class JobServiceImpl extends BaseServiceImpl<JobMapper, Job> implements JobService {

    private final IGenerator generator;

    @Override
    public Map<String, Object> queryAll(JobQueryCriteria criteria, Pageable pageable) {
        getPage(pageable);
        PageInfo<Job> page = new PageInfo<>(queryAll(criteria));
        Map<String, Object> map = new LinkedHashMap<>(2);
        map.put("content", generator.convert(page.getList(), JobDto.class));
        map.put("totalElements", page.getTotal());
        return map;
    }

    @Override
    public List<Job> queryAll(JobQueryCriteria criteria) {
        List<Job> jobList = baseMapper.selectList(QueryHelpPlus.getPredicate(Job.class, criteria));
        if(criteria.getDeptIds().size()==0){
            for (Job job : jobList) {
//                job.setDept(deptService.getById(job.getDeptId()));
            }
        }else {
            //断权限范围
            for (Long deptId : criteria.getDeptIds()) {
                for (Job job : jobList) {
                    if(deptId.equals(job.getDeptId())){
//                        job.setDept(deptService.getById(job.getDeptId()));
                    }
                }
            }
        }
        return jobList;
    }

    @Override
    public void download(List<JobDto> all, HttpServletResponse response) throws IOException {

    }
}
