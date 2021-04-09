package com.ali.springboot_mybatis.modle;


import java.io.Serializable;

public class PageResult<T> implements Serializable {
    private Long total;
    private T result;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public PageResult(Long total, T result) {
        this.total = total;
        this.result = result;
    }
}