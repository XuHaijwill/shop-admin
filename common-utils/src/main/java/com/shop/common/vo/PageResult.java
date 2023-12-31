package com.shop.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName PageResult
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/31 21:14
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
@Builder
public class PageResult<T> implements Serializable {


    @ApiModelProperty("总数量")
    private long totalElements;

    @ApiModelProperty("内容")
    private List<T> content;

    public PageResult(long totalElements, List<T> content) {
        this.totalElements = totalElements;
        this.content = content;
    }

    public PageResult() {
    }
}

