package com.shop.mybatis.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseDomain
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 20:48
 * @Version 1.0
 **/
@Getter
@Setter
public class BaseDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(fill= FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @TableField(fill= FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @TableLogic
    @JsonIgnore
    @TableField(fill= FieldFill.INSERT)
    private Integer isDel;
}
