package com.woniu.aw.springboot.common;

public class PageRequest implements java.io.Serializable {

    private static final long serialVersionUID = 4907542744785140042L;

    private int pageNum = 1;

    private int pageSize = 10;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
