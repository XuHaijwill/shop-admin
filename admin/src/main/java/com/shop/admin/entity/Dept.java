package com.shop.admin.entity;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shop.mybatis.common.entity.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @ClassName Dept
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:52
 * @Version 1.0
 **/

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("dept")
public class Dept extends BaseDomain {

    /** ID */
    @TableId(value = "id",type= IdType.AUTO)
    private Long id;


    /** 名称 */
    @NotBlank(message = "部门名称不能为空")
    private String name;


    /** 上级部门 */
    @NotNull(message = "上级部门不能为空")
    private Long pid;


    /** 状态 */
    private Boolean enabled;




    public void copy(Dept source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
