package com.lwx.itoken.common.service;

import com.lwx.itoken.common.domain.BaseDomain;
import com.github.pagehelper.PageInfo;

/**
 * @author Administrator
 */
public interface BaseService<T extends BaseDomain> {
    int insert(T t, String createBy);

    int delete(T t);

    int update(T t, String updateBy);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);
}
