package com.exam.bean;

import java.util.List;

/**
 * 分页数据封装类
 *
 * @author DELL
 */
public class PagedDate<T> {
    private int pageIndex;// 当前页码
    private int pageSize;// 页大小
    private int totalCount;// 总数据条数
    private int totalPageCount;// 总页数
    private List<T> list;// 当前页的数据集合
    private boolean hasUpPage;// 上一页
    private boolean hasNext;// 下一页

    public PagedDate() {
        super();
    }

    public PagedDate(int pageIndex, int pageSize, int totalCount, List<T> list) {
        super();
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.list = list;
        this.totalPageCount = totalCount % pageSize == 0 ? totalCount
                / pageSize : totalCount / pageSize + 1;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public boolean isHasUpPage() {
        if (this.pageIndex > 1) {
            return true;
        }
        return false;
    }

    public boolean isHasNext() {
        if (this.pageIndex < this.totalPageCount) {
            return true;
        }
        return false;
    }

}