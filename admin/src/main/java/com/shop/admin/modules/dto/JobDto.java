package com.shop.admin.modules.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName JobDto
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:02
 * @Version 1.0
 **/
@Data
public class JobDto implements Serializable {

    private Long id;

    private Long sort;

    private String name;

    private Boolean enabled;

    private DeptDto dept;

    private String deptSuperiorName;

    private Timestamp createTime;

//    public JobDto(String name, Boolean enabled) {
//        this.name = name;
//        this.enabled = enabled;
//    }
}
