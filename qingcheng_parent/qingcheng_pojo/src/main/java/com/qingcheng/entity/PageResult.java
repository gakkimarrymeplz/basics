package com.qingcheng.entity;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    private Long total;

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
