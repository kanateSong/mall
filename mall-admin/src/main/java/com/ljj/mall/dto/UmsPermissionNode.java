package com.ljj.mall.dto;

import com.ljj.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by ljj on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
