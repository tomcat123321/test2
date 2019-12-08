package com.exam.service;

import com.exam.bean.Invitation;
import com.exam.bean.PagedDate;

public interface InvitationService {

    /**
     * 分页显示
     *
     * @param pageIndex 当前页码
     * @param pageSize  显示条数
     * @return
     */
    public PagedDate<Invitation> getInvitationPages(int pageIndex, int pageSize, String title);
}
