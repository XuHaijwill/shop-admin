package com.shop.admin.modules.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName PermissionDto
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:58
 * @Version 1.0
 **/
@Data
public class PermissionDto implements Serializable {

    private Long id;

    private String name;

    private Long pid;

    private String alias;

    private Timestamp createTime;

    private List<PermissionDto> children;

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", alias='" + alias + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
