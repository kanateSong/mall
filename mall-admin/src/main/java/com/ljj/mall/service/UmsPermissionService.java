package com.ljj.mall.service;

import com.ljj.mall.dto.UmsPermissionNode;
import com.ljj.mall.model.UmsPermission;

import java.util.List;

/**
 * @Description: 后台用户权限管理Service
 * @author LeeJack
 * @Date 22:00 2019/5/4/004
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id , UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
