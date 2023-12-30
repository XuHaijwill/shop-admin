package com.shop.mybatis.common.web.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Paging
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/30 20:06
 * @Version 1.0
 **/
@ApiModel("分页")
public class Paging<T> implements Serializable {

    private static final long serialVersionUID = 1651602862088274130L;


    @ApiModelProperty("总行数")
    @JSONField(name = "total")
    @JsonProperty("total")
    private long total = 0;

    @ApiModelProperty("数据列表")
    @JSONField(name = "records")
    @JsonProperty("records")
    private List<T> records = Collections.emptyList();

    public Paging() {
    }

    public Paging(IPage page) {
        this.total = page.getTotal();
        this.records = page.getRecords();
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "total=" + total +
                ", records=" + records +
                '}';
    }
}
