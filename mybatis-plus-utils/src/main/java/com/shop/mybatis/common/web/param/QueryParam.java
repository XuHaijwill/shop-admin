package com.shop.mybatis.common.web.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName QueryParam
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/30 20:06
 * @Version 1.0
 **/
@Data
@ApiModel("查询参数对象")
public  abstract class QueryParam implements Serializable {
    private static final long serialVersionUID = 9059285630783131941L;

    @ApiModelProperty(value = "页码,默认为1")
    private Integer page =1;
    @ApiModelProperty(value = "页大小,默认为10")
    private Integer limit = 10;
    @ApiModelProperty(value = "搜索字符串")
    private String keyword;

    @ApiModelProperty(value = "当前第几页")
    public void setCurrent(Integer current) {
        if (current == null || current <= 0){
            this.page = 1;
        }else{
            this.page = current;
        }
    }

    public void setSize(Integer size) {
        if (size == null || size <= 0){
            this.limit = 10;
        }else{
            this.limit = size;
        }
    }
}
