package com.ljj.mall.portal.domain;

import com.ljj.mall.model.SmsCoupon;
import com.ljj.mall.model.SmsCouponHistory;
import com.ljj.mall.model.SmsCouponProductCategoryRelation;
import com.ljj.mall.model.SmsCouponProductRelation;

import java.util.List;

/**
 * @Description: 优惠券领取历史详情封装
 * @author LeeJack
 * @Date 18:03 2019/5/5/005
 */
public class SmsCouponHistoryDetail extends SmsCouponHistory {
    //相关优惠券信息
    private SmsCoupon coupon;
    //优惠券关联商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券关联商品分类
    private List<SmsCouponProductCategoryRelation> categoryRelationList;

    public SmsCoupon getCoupon() {
        return coupon;
    }

    public void setCoupon(SmsCoupon coupon) {
        this.coupon = coupon;
    }

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getCategoryRelationList() {
        return categoryRelationList;
    }

    public void setCategoryRelationList(List<SmsCouponProductCategoryRelation> categoryRelationList) {
        this.categoryRelationList = categoryRelationList;
    }
}
