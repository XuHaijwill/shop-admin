package com.shop.admin.modules.service;

import com.shop.admin.ApplicationRunTest;
import com.shop.admin.modules.dto.JobQueryCriteria;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class JobServiceTest extends ApplicationRunTest {

    @Autowired
    private JobService jobService;

    @Test
    void queryAll() {
        JobQueryCriteria criteria = new JobQueryCriteria();

        criteria.setDeptIds(new HashSet<Long>());

        Pageable pageable = PageRequest.of(0, 2);

        Map<String, Object> stringObjectMap = jobService.queryAll(criteria, pageable);
        System.out.println(stringObjectMap.size());
    }
}