package com.ljj.mall.portal.service.impl;

import com.ljj.mall.mapper.UmsMemberReceiveAddressMapper;
import com.ljj.mall.model.UmsMember;
import com.ljj.mall.model.UmsMemberReceiveAddress;
import com.ljj.mall.model.UmsMemberReceiveAddressExample;
import com.ljj.mall.portal.service.UmsMemberReceiveAddressService;
import com.ljj.mall.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Description: 用户地址管理Service实现类
 * @author LeeJack
 * @Date 18:51 2019/5/5/005
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    private UmsMemberService memberService;
    @Autowired
    private UmsMemberReceiveAddressMapper addressMapper;
    @Override
    public int add(UmsMemberReceiveAddress address) {
        UmsMember currentMember = memberService.getCurrentMember();
        address.setMemberId(currentMember.getId());
        return addressMapper.insert(address);
    }

    @Override
    public int delete(Long id) {
        UmsMember currentMember = memberService.getCurrentMember();
        UmsMemberReceiveAddressExample example = new UmsMemberReceiveAddressExample();
        example.createCriteria().andMemberIdEqualTo(currentMember.getId()).andIdEqualTo(id);
        return addressMapper.deleteByExample(example);
    }

    @Override
    public int update(Long id, UmsMemberReceiveAddress address) {
        address.setId(null);
        UmsMember currentMember = memberService.getCurrentMember();
        UmsMemberReceiveAddressExample example = new UmsMemberReceiveAddressExample();
        example.createCriteria().andMemberIdEqualTo(currentMember.getId()).andIdEqualTo(id);
        return addressMapper.updateByExampleSelective(address,example);
    }

    @Override
    public List<UmsMemberReceiveAddress> list() {
        UmsMember currentMember = memberService.getCurrentMember();
        UmsMemberReceiveAddressExample example = new UmsMemberReceiveAddressExample();
        example.createCriteria().andMemberIdEqualTo(currentMember.getId());
        return addressMapper.selectByExample(example);
    }

    @Override
    public UmsMemberReceiveAddress getItem(Long id) {
        UmsMember currentMember = memberService.getCurrentMember();
        UmsMemberReceiveAddressExample example = new UmsMemberReceiveAddressExample();
        example.createCriteria().andMemberIdEqualTo(currentMember.getId()).andIdEqualTo(id);
        List<UmsMemberReceiveAddress> addressList = addressMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(addressList)){
            return addressList.get(0);
        }
        return null;
    }
}
