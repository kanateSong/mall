package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by ljj on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}