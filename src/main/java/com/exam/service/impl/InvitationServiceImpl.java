package com.exam.service.impl;

import com.exam.bean.Invitation;
import com.exam.bean.PagedDate;
import com.exam.dao.InvitationMapper;
import com.exam.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    InvitationMapper invitationMapper;


    @Override
    public PagedDate<Invitation> getInvitationPages(int pageIndex, int pageSize, String title) {
        //总数据条数
        int totalCount = invitationMapper.getCount(title);
        //当前数据集合
        int from = (pageIndex - 1) * pageSize;// 起始下标
        List<Invitation> list = invitationMapper.getInvitationPages(from, pageSize, title);
        // 封装分页类
        PagedDate<Invitation> pagedDate = new PagedDate<Invitation>(pageIndex,
                pageSize, totalCount, list);
        return pagedDate;
    }
}
