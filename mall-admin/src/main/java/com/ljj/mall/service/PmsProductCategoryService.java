package com.ljj.mall.service;

import com.ljj.mall.dto.PmsProductCategoryParam;
import com.ljj.mall.dto.PmsProductCategoryWithChildrenItem;
import com.ljj.mall.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品分类Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductCategoryService {
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id , PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId , Integer pageSize , Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids , Integer navStatus);

    int updateShowStatus(List<Long> ids , Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
