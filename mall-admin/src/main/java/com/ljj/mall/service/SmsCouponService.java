package com.ljj.mall.service;

import com.ljj.mall.dto.SmsCouponParam;
import com.ljj.mall.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 优惠券管理Service
 * @author LeeJack
 * @Date 21:59 2019/5/4/004
 */
public interface SmsCouponService {
    /**
     * 添加优惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根据优惠券id删除优惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根据优惠券id更新优惠券信息
     */
    @Transactional
    int update(Long id , SmsCouponParam couponParam);

    /**
     * 分页获取优惠券列表
     */
    List<SmsCoupon> list(String name , Integer type , Integer pageSize , Integer pageNum);

    /**
     * 获取优惠券详情
     * @param id 优惠券表id
     */
    SmsCouponParam getItem(Long id);
}
