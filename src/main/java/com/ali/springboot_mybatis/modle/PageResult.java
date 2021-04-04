package com.ali.springboot_mybatis.modle;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageResult<T> implements Serializable {
    private Long total;
    private T result;

    public PageResult(Long total, T result) {
        this.total = total;
        this.result = result;
    }
}