package com.ljj.mall.service.impl;

import com.ljj.mall.mapper.UmsMemberLevelMapper;
import com.ljj.mall.model.UmsMemberLevel;
import com.ljj.mall.model.UmsMemberLevelExample;
import com.ljj.mall.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 会员等级管理Service实现类
 * @author LeeJack
 * @Date 22:14 2019/5/4/004
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
