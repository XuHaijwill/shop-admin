package com.shop.mybatis.common.web.param;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @ClassName OrderQueryParam
 * @Description //TODO
 * @Author XuHaijwill
 * @Date 2023/12/30 20:16
 * @Version 1.0
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("可排序查询参数对象")
public abstract class OrderQueryParam extends QueryParam{

    private static final long serialVersionUID = -7656369433943430736L;

    @ApiModelProperty(value = "排序")
    private List<OrderItem> orders;

    public void defaultOrders(List<OrderItem> orderItems){
        if (CollectionUtil.isEmpty(orderItems)){
            return;
        }
        this.orders = orderItems;
    }

}
