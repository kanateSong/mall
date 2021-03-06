package com.ljj.mall.portal.domain;

import com.ljj.mall.model.OmsOrder;
import com.ljj.mall.model.OmsOrderItem;

import java.util.List;

/**
 * @Description: 包含订单商品信息的订单详情
 * @author LeeJack
 * @Date 18:02 2019/5/5/005
 */
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
