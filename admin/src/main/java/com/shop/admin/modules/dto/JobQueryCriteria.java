package com.shop.admin.modules.dto;

import com.shop.mybatis.annotation.Query;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * @ClassName JobQueryCriteria
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:59
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    @Query
    private Boolean enabled;

    @Query
    private Long deptId;

    @Query(propName = "deptId",  type = Query.Type.IN)
    private Set<Long> deptIds;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
