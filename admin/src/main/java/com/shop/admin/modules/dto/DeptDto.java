package com.shop.admin.modules.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName DeptDto
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:02
 * @Version 1.0
 **/
@Getter
@Setter
public class DeptDto implements Serializable {

    /** ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 上级部门 */
    private Long pid;

    /** 状态 */
    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDto> children;

    /** 创建日期 */
    private Timestamp createTime;

    public String getLabel() {
        return name;
    }
}