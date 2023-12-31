package com.shop.admin.entity;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shop.mybatis.common.entity.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName Job
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:53
 * @Version 1.0
 **/

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("job")
public class Job extends BaseDomain {

    /** 岗位ID */
    @TableId
    private Long id;

    /** 岗位名称 */
    @NotBlank(message = "岗位名称不能为空")
    private String name;


    /** 岗位状态 */
    private Boolean enabled;

    @TableField(exist = false)
    private Dept dept;

    /** 岗位排序 */
    private Long sort;


    /** 部门ID */
    private Long deptId;




    public void copy(Job source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
