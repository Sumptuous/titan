package com.wyy.titan.common.page;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 对Page<E>结果进行包装
 * Author: liuzh
 * @version 3.2.2
 * @since 3.2.2
 */
public class PageInfo<T> {
    private Integer pageNum;
    private int pageSize;
    private int startRow;
    private int endRow;
    private long totalCount;
    private long totalNum;
    private int pages;
    private List<T> data = new ArrayList<T>();

    public PageInfo(){
    	
    }
    
    public PageInfo(long totalCount, List<T> data) {
		super();
		this.totalCount = totalCount;
		this.data = data;
	}

	public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.startRow = page.getStartRow();
            this.endRow = page.getEndRow();
            this.totalCount = page.getTotal();
            this.totalNum = this.totalCount;
            this.pages = page.getPages();
            this.data = page;
        }
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		this.setTotalNum(totalCount);
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}

	public long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(long totalNum) {
		this.totalNum = totalNum;
	}
}
