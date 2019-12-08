package com.exam.dao;

import com.exam.bean.Invitation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InvitationMapper {
    /**
     * 总数据条数
     *
     * @param title
     * @return
     */
    public int getCount(@Param("title") String title);

    /**
     * 分页查询某一页数据
     *
     * @param from     起始下标
     * @param pageSize 显示总数据条数
     * @return
     */
    public List<Invitation> getInvitationPages(@Param("from") int from, @Param("pageSize") int pageSize, @Param("title") String title);
}
